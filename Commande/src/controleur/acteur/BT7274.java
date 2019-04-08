/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.acteur;

/**
 *
 * @author tpedrero
 */
public class BT7274 implements Acteur{

    @Override
    public void sauter() {
        System.out.println("BT7274 - Sauter");
    }

    @Override
    public void tirer() {
        System.out.println("BT7274 - Tirer");
    }

    @Override
    public void esquiver() {
        System.out.println("BT7274 - Esquiver");
    }

    @Override
    public void changerArme() {
        System.out.println("BT7274 - ChangerArme");
    }
    
}
