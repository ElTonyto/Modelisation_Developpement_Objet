/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commande;

import controleur.Bouton;
import controleur.Controleur;
import controleur.acteur.BT7274;
import controleur.acteur.Drone;
import controleur.commande.CommandeEsquive;
import controleur.commande.CommandeSaut;
import controleur.commande.CommandeTir;

/**
 *
 * @author tpedrero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drone drone = new Drone();
        BT7274 bt = new BT7274();
        Controleur controleur = new Controleur(bt);
        
        System.out.println("\nMODE DE JEU : NORMAL");
        System.out.println(controleur);
        
        controleur.jouer(Bouton.X);
        controleur.jouer(Bouton.Y);
        controleur.jouer(Bouton.A);
        controleur.jouer(Bouton.B);
        
        System.out.println("\nMODE DE JEU : AVANTURE");
        
        controleur.setCommande(Bouton.Y);
        controleur.setCommande(Bouton.B, new CommandeSaut());
        
        System.out.println(controleur);
        
        controleur.jouer(Bouton.X);
        controleur.jouer(Bouton.Y);
        controleur.jouer(Bouton.A);
        controleur.jouer(Bouton.B);
        
        System.out.println("\nMODE DE JEU : EXPLORATION");
        
        controleur.setActeur(drone);
        controleur.reinitialiserCommande();
        controleur.setCommande(Bouton.X, new CommandeEsquive());
        controleur.setCommande(Bouton.B, new CommandeTir());
        
        System.out.println(controleur);
        
        controleur.jouer(Bouton.X);
        controleur.jouer(Bouton.Y);
        controleur.jouer(Bouton.A);
        controleur.jouer(Bouton.B);
    }
    
}
