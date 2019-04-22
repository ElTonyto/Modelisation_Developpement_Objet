/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surveillance.observable;

import java.util.ArrayList;
import surveillance.Evenement;
import surveillance.Observable;
import surveillance.Observateur;

/**
 *
 * @author tpedrero
 */
public class EspionEvenement implements Observable {

    public ArrayList<Observateur> observateurs = new ArrayList<>();
    public static EspionEvenement observable = new EspionEvenement();

    private EspionEvenement() {
    }

    public void alerter(Evenement ev){
        for( Observateur observateur : observateurs){
            observateur.alerter(ev);
        }
    }
    
    @Override
    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void supprimerObservateur(Observateur observateur) {
        observateurs.remove(observateur);
    }
}
