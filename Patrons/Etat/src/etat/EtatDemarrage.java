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
public class EtatDemarrage implements Etat{
    public void afficherInfo(){
        System.out.println("-----------------------\n"
                + "ETAT ACTUEL : DEMARRAGE\n" 
                + "-----------------------\n");
    }
    
    public void afficherCommande(){
        System.out.println("Commandes" + "\n" 
                + "    0 - Eteindre le PC \n" 
                + "    1 - CTRL+ALT+SUPPR \n");
    }
    
    @Override
    public Etat envoyerCommande( int commande){
         switch (commande) {
            case 0:
                return new EtatEteint();
            case 1:
                return new EtatAuthentification();
            default:
                break;
        }
        return this;
    }
}
