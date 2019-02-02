package fabriqueabstraite;

import java.util.ArrayList;
import java.util.List;
import vehicule.FabriqueAirbus;
import vehicule.FabriqueBombardier;
import vehicule.FabriqueVehicule;
import vehicule.Vehicule;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpedrero
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Vehicule> mesVehicules = new ArrayList<>();
        FabriqueVehicule fabrique;
        
        fabrique = new FabriqueAirbus();
        mesVehicules.add(fabrique.createAvion("A380"));
        mesVehicules.add(fabrique.createAvion("A220_300"));
        
        fabrique = new FabriqueBombardier();
        mesVehicules.add(fabrique.createAvion("CRJ1000"));
        mesVehicules.add(fabrique.createAvion("GLOBAL8000"));
        mesVehicules.add(fabrique.createMotoneige("SKIDOO_EXPEDITION_SPORT"));
        mesVehicules.add(fabrique.createMotoneige("SKIDOO_RENEGADE"));
        
        for(Vehicule vehicule: mesVehicules){
            vehicule.afficherCaracteristiques();
            vehicule.afficherPublicite();
            System.err.println();
        }
    }
}
