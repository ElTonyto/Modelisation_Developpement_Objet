/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructeur;

/**
 *
 * @author tpedrero
 */
public abstract class ConstructeurContrat {
    
    protected Contrat contrat;
    
    public void construitBonDeCommande(String nomClient){
        contrat.ajouteDocument("Bon de commande Client : " + nomClient);
    }
    
    public void construitDemandeImmatriculation(String nomDemandeur){
        contrat.ajouteDocument("Demande d'immatriculation Demandeur : " + nomDemandeur);  
    }
    
    public Contrat resultat(){
        return contrat;
    }
}
