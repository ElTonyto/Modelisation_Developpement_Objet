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

    private ArrayList<Observateur> observateurs;
    private static Observable observable;

    private EspionEvenement() {

    }

    public void alerter(Evenement evenement) {

    }

    @Override
    public void ajouterObservateur(Observateur observateur) {

    }

    @Override
    public void supprimerObservateur(Observateur observateur) {

    }
}
