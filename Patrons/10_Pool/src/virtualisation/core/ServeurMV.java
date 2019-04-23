package virtualisation.core;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

// Coder methode de transfert


public abstract class ServeurMV extends Thread{

    private final int MIN_POOL;
    private final int MAX_POOL;
    private final int MIN_LIBRE;
    private final int MAX_LIBRE;
    private final int INTERVALLE_DECONNEXION;
    private final int INCREMENT;
    private final int DELAI_RECUPERATION_SESSION;
    private boolean enExecution;
    private Stack<Session> sessions = new Stack<>();
    private Set<SessionWrapper> sessionsUtilisees = new HashSet<>();
    
    public ServeurMV() throws SessionException {
        this (3, 20, 2, 2, 5, 2000, 500);
    }

    public ServeurMV(int minPool, int maxPool, int increment, int minLibre, int maxLibre, int intervalleDeconnexion, int delaiRecuperationSession) throws SessionException {
        MIN_POOL = minPool;
        MAX_POOL = maxPool;
        INCREMENT = increment;
        MIN_LIBRE = minLibre;
        MAX_LIBRE = maxLibre;
        INTERVALLE_DECONNEXION = intervalleDeconnexion;
        DELAI_RECUPERATION_SESSION = delaiRecuperationSession;
    }

    public SessionWrapper connexion(String utilisateur) throws SessionException{
        if( sessionsUtilisees.size() <= MAX_POOL){
            SessionWrapper sw = genererSessionWrapper(utilisateur);
            return sw;
        }
        throw new SessionException("Too many users", -1, utilisateur);
    }
    
    public void demarrer(){
        enExecution = true;
        gererSessions();
        start();
    }
    
    public void arreter(){
        enExecution = false;
        supprimerSessionsUtilisees();
    }
    
    public boolean enExecution(){
        return enExecution;
    }
    
    private void gererSessions(){
        if(this.sessions.size() <= MIN_LIBRE){
            while (this.sessions.size() <= MAX_LIBRE){
                sessions.push(creerSession());
            }
        }
    }
    
    private SessionWrapper genererSessionWrapper(String utilisateur) throws SessionException{
        if(!sessions.empty()){
            Session session = this.sessions.pop();
            if( session != null){
                SessionWrapper sw = new SessionWrapper(session);
                session.connecter(utilisateur);
                this.sessionsUtilisees.add(sw);
                return sw;
            }
        }
        throw new SessionException("Session empty", -1, utilisateur);
    }
    
    private void supprimerSessionsNonUtilisees(){
        Set<SessionWrapper> mySet = new HashSet<>();
        sessionsUtilisees.forEach((sw) ->{
            Session session = sw.recupererSession(INTERVALLE_DECONNEXION);
            if(session != null){
                mySet.add(sw);
                sessions.push(session);
            }
        });
        mySet.forEach(this.sessionsUtilisees::remove);
    }
    
    private void supprimerSessionsUtilisees(){
        Set<SessionWrapper> mySet = new HashSet<>();
        sessionsUtilisees.forEach((sw) ->{
            Session session = sw.recupererSession();
            if(session != null){
                mySet.add(sw);
                sessions.push(session);
            }
        });
        mySet.forEach(this.sessionsUtilisees::remove);
    }
    
    private void afficherSession(String message){
        System.out.println(message);
        System.out.println(sessions);
        System.out.println(sessionsUtilisees);
    }
    
    protected abstract Session creerSession();
    
    @Override
    public void run(){
        while(enExecution()){
            afficherSession("AVANT GERER");
            gererSessions();
            afficherSession("APRES GERER");
            supprimerSessionsNonUtilisees();
            try{
                sleep(DELAI_RECUPERATION_SESSION);
            }catch(InterruptedException e){
                
            }
        }
    }
}
