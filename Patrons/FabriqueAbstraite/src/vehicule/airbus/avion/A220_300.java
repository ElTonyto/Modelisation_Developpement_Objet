/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicule.airbus.avion;

import vehicule.Avion;

/**
 *
 * @author tpedrero
 */
public class A220_300 extends Avion{

    public A220_300() {
        super(160, 0.82, 6112);
    }
    
    @Override
    public void afficherPublicite() {
        System.out.println("A220_300, un avion gros mais pas trop \n");
    }
}
