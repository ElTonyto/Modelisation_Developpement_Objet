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
public abstract class Motoneige implements Vehicule{

    private int longueurChenille;
    private int PDSF;
    
    public Motoneige( int longueurChenille, int PDSF){
        this.PDSF = PDSF;
        this.longueurChenille = longueurChenille;
    }
    
    @Override
    public void afficherCaracteristiques() {
        System.out.println("Caractéristiques" + "\n"
            + "Longueur des chenilles: " + this.longueurChenille + "\n"
            + "Prix de détail: " + this.PDSF);
    }  

}
