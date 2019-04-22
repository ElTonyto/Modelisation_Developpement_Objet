/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicule.bombardier.avion;

import vehicule.Avion;

/**
 *
 * @author tpedrero
 */
public class CRJ1000 extends Avion {

    public CRJ1000() {
        super(104, 0.835, 1650);
    }
    
    @Override
    public void afficherPublicite() {
        System.out.println("CRJ1000, cet avion a un nom etrange \n");         
    }
}
