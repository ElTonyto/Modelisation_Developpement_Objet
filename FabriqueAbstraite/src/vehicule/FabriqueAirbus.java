/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicule;

import vehicule.airbus.avion.A220_300;

/**
 *
 * @author tpedrero
 */
public class FabriqueAirbus implements FabriqueVehicule{

    @Override
    public Motoneige createMotoneige(String modele) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Avion createAvion(String modele) {
        Avion avion = new A220_300();
        return avion;
    }
}
