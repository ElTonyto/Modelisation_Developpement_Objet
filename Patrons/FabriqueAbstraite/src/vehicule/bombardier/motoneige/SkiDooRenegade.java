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
public class SkiDooRenegade extends Motoneige {

    public SkiDooRenegade() {
        super(137, 16704);
    }
    
    @Override
    public void afficherPublicite() {
        System.out.println("SkiDoo Renegade, une moto renegade");
    }
}
