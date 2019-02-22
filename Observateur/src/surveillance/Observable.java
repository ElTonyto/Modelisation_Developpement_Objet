/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surveillance;

/**
 *
 * @author tpedrero
 */
public interface Observable {

    public void ajouterObservateur(Observateur observateur);

    public void supprimerObservateur(Observateur observateur);
}
