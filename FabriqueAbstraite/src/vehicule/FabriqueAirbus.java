/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicule;

import com.sun.xml.internal.ws.resources.ModelerMessages;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import vehicule.airbus.avion.A220_300;
import vehicule.airbus.avion.A380;
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
    
    
    public FabriqueAirbus() {
        mesAvions.put("A220_300", A220_300.class);
        mesAvions.put("A380", A380.class);
    }
   

    @Override
    public Avion createAvion(String modele) {
        Avion avion = null;
        try {
            avion = (Avion) mesAvions.get(modele).newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(FabriqueAirbus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FabriqueAirbus.class.getName()).log(Level.SEVERE, null, ex);
        }
        return avion;
    }

    @Override
    public Motoneige createMotoneige(String modele) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
