/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directeur;

import constructeur.ConstructeurContrat;
import constructeur.Contrat;

/**
 *
 * @author tpedrero
 */
public class Vendeur {
    
    protected ConstructeurContrat constructeur;
    
    public Vendeur( ConstructeurContrat constructeur){
        this.constructeur = constructeur;
    }
    
    public Contrat construit( String nomClient){
        constructeur.construitBonDeCommande(nomClient);
        constructeur.construitDemandeImmatriculation(nomClient);
        return constructeur.resultat();
    }
    
}
