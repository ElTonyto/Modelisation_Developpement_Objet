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
public class EtatAuthentification implements Etat {

    @Override
    public void afficherInfo() {
        System.out.println("-----------------------\n"
                + "ETAT ACTUEL : AUTHENTIFICATION\n" 
                + "-----------------------\n");
    }

    @Override
    public void afficherCommande() {
        System.out.println("Commandes" + "\n" 
                + "    0 - Eteindre le PC \n" 
                + "    1 - Fermer le PC \n"
                + "    2 - Authentification \n");
    }

    @Override
    public Etat envoyerCommande(int commande) {
        switch (commande) {
            case 0:
                return new EtatEteint();
            case 1:
                return new EtatFermeture();
            case 2:
                return new EtatUtilistation();
            default:
                break;
        }
        return this;
    }
    
}
