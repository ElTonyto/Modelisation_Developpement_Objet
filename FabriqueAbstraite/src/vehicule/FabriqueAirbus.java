/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicule;

import java.util.HashMap;
import vehicule.airbus.avion.A220_300;
import vehicule.bombardier.avion.CRJ1000;
import vehicule.bombardier.avion.Global8000;
import vehicule.bombardier.motoneige.SkiDooExpeditionSport;
import vehicule.bombardier.motoneige.SkiDooRenegade;

/**
 *
 * @author tpedrero
 */
public class FabriqueAirbus implements FabriqueVehicule{

    HashMap<String, Class> mesAvions = new HashMap<>();
    HashMap<String, Class> mesMotos = new HashMap<>();
    
    
    public FabriqueBombardier() {
        mesAvions.put("CRJ1000", CRJ1000.class);
        mesAvions.put("GLOBAL8000", Global8000.class);
    
        mesMotos.put("SKIDOO_EXPEDITION", SkiDooExpeditionSport.class);
        mesMotos.put("SKIDOO_RENEGADE", SkiDooRenegade.class);
    }
    
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
