/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import controleur.acteur.Acteur;
import controleur.commande.Commande;
import controleur.commande.CommandeChangementArme;
import controleur.commande.CommandeEsquive;
import controleur.commande.CommandeSaut;
import controleur.commande.CommandeTir;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tpedrero
 */
public class Controleur {
    private final Map<Bouton, Commande> commandes = new HashMap<>();
    private Acteur acteur;
    
    public Controleur(Acteur acteur){
        this.acteur = acteur;
        reinitialiserCommande();
    }
    
    public void reinitialiserCommande(){
        setCommande(Bouton.X, new CommandeSaut());
        setCommande(Bouton.Y, new CommandeTir());
        setCommande(Bouton.A, new CommandeEsquive());
        setCommande(Bouton.B, new CommandeChangementArme());
    }
    
    public void setCommande(Bouton bouton, Commande commande){
        if(commandes.containsKey(bouton)){
            commandes.replace(bouton, commande);
        }else{
            commandes.put(bouton, commande);
        }
    }
    
    public void setCommande(Bouton bouton){
        setCommande(bouton, null);
    }
    
    public void setActeur(Acteur acteur){
        this.acteur = acteur;
    }
    
    public void jouer(Bouton bouton){
        if(commandes.get(bouton) != null){
            commandes.get(bouton).executer(acteur);
        }
    }
    
    public String toString(){
        String s = "Controleur { \n";
        for(Map.Entry<Bouton, Commande> commande : commandes.entrySet()){
            if(commande.getValue() != null){
                s = s + "[" + commande.getKey() + "] " + " [" + commande.getValue().toString() + "] \n";
            }else {
                s = s + "[" + commande.getKey() + "] " + " [NULL] \n";
            }
        }
        s = s + "}";
        return s;
    }
}
