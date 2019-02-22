/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surveillance.observateur;

import surveillance.Evenement;
import surveillance.Observateur;

/**
 *
 * @author tpedrero
 */
public class Rapport implements Observateur{

    public Rapport(){
        
    }
    
    @Override
    public void alerter(Evenement evenement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
