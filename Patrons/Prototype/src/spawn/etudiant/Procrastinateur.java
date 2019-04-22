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
public class Procrastinateur extends Monstre{
    
    private String travail;

    public Procrastinateur(String travail) {
        super("PROCRASTINATEUR");
        this.travail = travail;
    }

    protected final Procrastinateur clone() throws CloneNotSupportedException {

        Procrastinateur procrastinateur = null;
        try {
            procrastinateur = (Procrastinateur) super.clone();
            procrastinateur.travail = this.travail;
        }
        catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return procrastinateur;
    }

    @Override
    public String toString() {
        return super.toString() + "{PROCRASTINATEUR{" + travail + "}}";
    }
}
