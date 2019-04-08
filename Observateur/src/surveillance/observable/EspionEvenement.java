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

    private ArrayList<Observateur> observateurs = new ArrayList<>();
    public static Observable observable;

    private EspionEvenement() {
    }

    @Override
    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void supprimerObservateur(Observateur observateur) {
        observateurs.remove(observateur);
    }
    
    public Observable getObservable(){
        return this.observable;
    }
}
