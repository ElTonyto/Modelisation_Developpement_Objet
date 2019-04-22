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
public class CommandeEsquive implements Commande{

    @Override
    public void executer(Acteur acteur) {
        acteur.esquiver();    }
    
    @Override
    public String toString(){
        return "ESQUIVER";
    }
    
}
