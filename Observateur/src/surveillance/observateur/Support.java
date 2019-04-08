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
public class Support implements Observateur {

    public Support(){
        EspionEvenement.observable.ajouterObservateur(this);
    }
    
    @Override
    public void alerter(Evenement evenement) {
        if(evenement.getNiveauUrgence() >= 90){
            System.out.println("SUPPROT : " + evenement.toString());
        }
    }
    
    
    
}
