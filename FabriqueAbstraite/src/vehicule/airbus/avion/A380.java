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
public class A380 extends Avion{
    
     public A380() {
        super(853, 0.93, 15200);
    }

    @Override
    public void afficherPublicite() {
        System.out.println("A380, un gros avion \n");
    }
    
}
