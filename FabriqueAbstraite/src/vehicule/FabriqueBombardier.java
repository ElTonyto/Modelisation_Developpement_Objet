/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicule;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import vehicule.bombardier.avion.CRJ1000;
import vehicule.bombardier.avion.Global8000;
import vehicule.bombardier.motoneige.SkiDooExpeditionSport;
import vehicule.bombardier.motoneige.SkiDooRenegade;
import vehicule.Avion;
import vehicule.Motoneige;

/**
 *
 * @author tpedrero
 */
public class FabriqueBombardier implements FabriqueVehicule{

    HashMap<String, Class> mesAvions = new HashMap<>();
    HashMap<String, Class> mesMotos = new HashMap<>();
    
    
    public FabriqueBombardier() {
        mesAvions.put("CRJ1000", CRJ1000.class);
        mesAvions.put("GLOBAL8000", Global8000.class);
    
        mesMotos.put("SKIDOO_EXPEDITION_SPORT", SkiDooExpeditionSport.class);
        mesMotos.put("SKIDOO_RENEGADE", SkiDooRenegade.class);
    }
    
    @Override
    public Motoneige createMotoneige(String modele) {
        
        Motoneige motoneige = null;
        try {
            motoneige = (Motoneige) mesMotos.get(modele).newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(FabriqueBombardier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FabriqueBombardier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return motoneige;
     
    }

    @Override
    public Avion createAvion(String modele) {
        
        Avion avion = null;
        try {
            avion = (Avion) mesAvions.get(modele).newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(FabriqueBombardier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FabriqueBombardier.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return avion;
        
    }
    
}
