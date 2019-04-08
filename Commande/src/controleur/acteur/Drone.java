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
public class Drone implements Acteur{

    @Override
    public void sauter() {
        System.out.println("Drone - Sauter");
    }

    @Override
    public void tirer() {
        System.out.println("Drone - Tirer");
    }

    @Override
    public void esquiver() {
        System.out.println("Drone - Esquiver");
    }

    @Override
    public void changerArme() {
        System.out.println("Drone - ChangerArme");
    }
    
}
