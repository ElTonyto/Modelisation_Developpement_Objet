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
public class EtatUtilistation implements Etat {

    @Override
    public void afficherInfo() {
        System.out.println("-----------------------\n"
                + "ETAT ACTUEL : UTILISATION\n" 
                + "-----------------------\n");
    }

    @Override
    public void afficherCommande() {
        System.out.println("Commandes" + "\n" 
                + "    0 - Eteindre le PC \n" 
                + "    1 - Fermer la session \n"
                + "    2 - Fermer le PC \n");
    }

    @Override
    public Etat envoyerCommande(int commande) {
        switch (commande) {
            case 0:
                return new EtatEteint();
            case 1:
                return new EtatAuthentification();
            case 2:
                return new EtatFermeture();
            default:
                break;
        }
        return this;
    }
    
}
