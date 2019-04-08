/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surveillance.observateur;

import surveillance.Evenement;
import surveillance.Observateur;
import surveillance.observable.EspionEvenement;

/**
 *
 * @author tpedrero
 */
public class Rapport implements Observateur{

    public Rapport(){
        EspionEvenement.observable.ajouterObservateur(this);
    }
    
    @Override
    public void alerter(Evenement evenement) {
        System.out.println(evenement.toString());
    }
    
}
