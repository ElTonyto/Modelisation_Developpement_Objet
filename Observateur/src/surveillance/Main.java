/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surveillance;

import surveillance.observable.EspionEvenement;
import surveillance.observable.ThreadEvenement;
import surveillance.observateur.GenerateurBillet;
import surveillance.observateur.Log;
import surveillance.observateur.Rapport;
import surveillance.observateur.Support;

/**
 *
 * @author tpedrero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        ThreadEvenement te = new ThreadEvenement();
        te.start();
        
        Log log = new Log(50);
        Rapport rapport = new Rapport();
        Support support = new Support();
        GenerateurBillet generateurBillet = new GenerateurBillet();
        
        Thread.sleep(5000);
        
        EspionEvenement.observable.supprimerObservateur(log);
        EspionEvenement.observable.supprimerObservateur(rapport);
        EspionEvenement.observable.supprimerObservateur(support);
    }
    
}
