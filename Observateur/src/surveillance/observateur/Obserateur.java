/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surveillance.observateur;

import surveillance.Evenement;

/**
 *
 * @author tpedrero
 */
interface Obserateur {
    public void alerter(Evenement evenement);
}
