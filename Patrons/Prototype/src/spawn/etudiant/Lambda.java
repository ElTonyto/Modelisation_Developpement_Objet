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
public class Lambda extends Monstre {
    
    private String sociabilite;

    public Lambda(String sociabilite) {
        super("LAMBDA");
        this.sociabilite = sociabilite;
    }

    protected final Lambda clone() throws CloneNotSupportedException {

        Lambda lambda = null;
        try {
            lambda = (Lambda) super.clone();
            lambda.sociabilite = this.sociabilite;
        }
        catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return lambda;
    }

    @Override
    public String toString() {
        return super.toString() + "{LAMBDA{" + sociabilite + "}}";
    }
}
