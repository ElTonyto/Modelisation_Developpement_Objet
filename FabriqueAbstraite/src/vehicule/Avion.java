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
public class Avion implements Vehicule{

    private int passagerMax;
    private double vitesseMaxCroisiere;
    private int distanceFranchissable;
    
    public Avion (int passagerMax, double vitesseMaxCroisiere, int distanceFrachissable){
        this.passagerMax = passagerMax;
        this.vitesseMaxCroisiere = this.vitesseMaxCroisiere;
        this.distanceFranchissable = distanceFrachissable;
    }
    
    @Override
    public void afficherCaracteristiques() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afficherPublicite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
