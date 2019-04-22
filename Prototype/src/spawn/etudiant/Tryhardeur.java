/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spawn.etudiant;

import spawn.Monstre;

/**
 *
 * @author tpedrero
 */
public class Tryhardeur extends Monstre {
    
    private String sommeil;

    public Tryhardeur(String sommeil) {
        super("TRYHARDEUR");
        this.sommeil = sommeil;
    }

    protected final Tryhardeur clone() throws CloneNotSupportedException {

        Tryhardeur tryhardeur = null;
        try {
            tryhardeur = (Tryhardeur) super.clone();
            tryhardeur.sommeil = this.sommeil;
        }
        catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return tryhardeur;
    }

    @Override
    public String toString() {
        return super.toString() + "{TRYHARDEUR{" + sommeil + "}}";
    }
}
