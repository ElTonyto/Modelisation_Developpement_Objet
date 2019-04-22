/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.commande;

import controleur.acteur.Acteur;

/**
 *
 * @author tpedrero
 */
public class CommandeTir implements Commande{

    @Override
    public void executer(Acteur acteur) {
        acteur.tirer();
    }
    
    @Override
    public String toString(){
        return "TIR";
    }
    
}
