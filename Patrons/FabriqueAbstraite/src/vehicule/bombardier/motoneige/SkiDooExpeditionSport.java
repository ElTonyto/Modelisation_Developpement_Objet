/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicule.bombardier.motoneige;

import vehicule.Motoneige;

/**
 *
 * @author tpedrero
 */
public class SkiDooExpeditionSport extends Motoneige {

    public SkiDooExpeditionSport() {
        super(154, 10654);
    }
 
    @Override
    public void afficherPublicite() {
        System.out.println("SkiDoo Expedition Sport, pour un max de fun");
    }
}
