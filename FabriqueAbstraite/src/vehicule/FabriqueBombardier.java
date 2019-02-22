/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicule;

import java.util.HashMap;
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
    
        mesMotos.put("SKIDOO_EXPEDITION", SkiDooExpeditionSport.class);
        mesMotos.put("SKIDOO_RENEGADE", SkiDooRenegade.class);
    }
    
    @Override
    public Motoneige createMotoneige(String modele) {
        
        Motoneige m = new Motoneige(0, 0);
        String msg = "un esprit maléfique est passé par ici. Qui est - ce ? Est-il passé ailleurs??? Le mystere reste entier...";
        System.out.println(msg);
        return null;
     
    }

    @Override
    public Avion createAvion(String modele) {
        
        Avion a = new Avion(0, 0, 0);
        
        return null;
        
    }
    
}