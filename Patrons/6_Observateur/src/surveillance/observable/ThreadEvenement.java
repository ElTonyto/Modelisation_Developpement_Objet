/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surveillance.observable;

import java.util.logging.Level;
import java.util.logging.Logger;
import surveillance.Evenement;

/**
 *
 * @author tpedrero
 */
public class ThreadEvenement extends Thread {

    private EspionEvenement espion;
    private static String[] descriptionsEvenement = {"Feu", "Fuite d'eau", "Panne de courant",
            "Grève", "Bris majeur"};

    @Override
    public void run() {
        while(true){
            Evenement ev = new Evenement((int) (Math.random() * 100),
                    descriptionsEvenement[ (int) (Math.random() * descriptionsEvenement.length)] );
            try {
                Thread.sleep(1000);
                EspionEvenement.observable.alerter(ev);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadEvenement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
