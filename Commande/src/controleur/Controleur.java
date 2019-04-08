/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import controleur.acteur.Acteur;
import controleur.commande.Commande;

/**
 *
 * @author tpedrero
 */
public class Controleur {
    private Commande commande;
    private Acteur acteur;
    
    public Controleur(Acteur acteur){
        this.acteur = acteur;
        reinitialiserCommande();
    }
    
    public void reinitialiserCommande(){
    }
    
    public void setCommande(Bouton bouton, Commande commande){
        
    }
    
    public void setCommande(Bouton bouton){
        switch(bouton){
                case X:
                    
                    break;
                case Y:
                    break;
                case A:
                    break;
                case B:
                    break;
                default:
                    break;
        }
    }
    
    public void jouer(Bouton bouton){
        
    }
    
    public String toString(){
        return null;
    }
}
