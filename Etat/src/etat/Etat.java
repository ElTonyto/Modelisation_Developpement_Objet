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
public interface Etat {

    public void afficherInfo();
    
    public void afficherCommande();
    
    public Etat envoyerCommande( int commande);
    
}
