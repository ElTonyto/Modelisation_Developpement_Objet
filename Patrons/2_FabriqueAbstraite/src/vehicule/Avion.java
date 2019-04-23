/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicule;

/**
 *
 * @author tpedrero
 */
public abstract class Avion implements Vehicule{

    private int passagerMax;
    private double vitesseMaxCroisiere;
    private int distanceFranchissable;
    
    public Avion (int passagerMax, double vitesseMaxCroisiere, int distanceFrachissable){
        this.passagerMax = passagerMax;
        this.vitesseMaxCroisiere = vitesseMaxCroisiere;
        this.distanceFranchissable = distanceFrachissable;
    }
    
    @Override
    public void afficherCaracteristiques() {
        System.out.println( "Caractéristiques" + "\n"
                + "Distance:" + this.distanceFranchissable + "\n"
                + "Passager Max:" + this.passagerMax + "\n" 
                + "Vitesse: " + this.vitesseMaxCroisiere);
    }
    
}
