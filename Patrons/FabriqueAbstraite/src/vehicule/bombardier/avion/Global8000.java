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
public class Global8000 extends Avion {

    public Global8000() {
        super(17, 0.90, 7900);
    }

    @Override
    public void afficherPublicite() {
        System.out.println("Global8000, globalement le nom est global \n");
    }
}
