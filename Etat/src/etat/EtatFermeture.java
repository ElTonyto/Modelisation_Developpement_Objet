/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etat;

/**
 *
 * @author tpedrero
 */
public class EtatFermeture implements Etat{
    @Override
    public void afficherInfo(){
        System.out.println("-----------------------\n"
                + "ETAT ACTUEL : FERMETURE\n" 
                + "-----------------------\n");
    }
    
    @Override
    public void afficherCommande(){
        System.out.println("Commandes" + "\n" 
                + "    0 - Eteindre le PC \n");
    }
    
    @Override
    public Etat envoyerCommande( int commande){
        if( commande == 0){
            return new EtatEteint();
        }
        return this;
        
    }
}
