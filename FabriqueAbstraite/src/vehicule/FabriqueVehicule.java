/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicule;

/**
 *
 * @author tpedrero
 */
public interface FabriqueVehicule {
    
    public Motoneige createMotoneige(String modele);
    public Avion createAvion(String modele);
}
