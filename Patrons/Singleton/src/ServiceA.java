

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpedrero
 */
public class ServiceA extends Service implements ServiceAInterface{

    public ServiceA() {
    }
    
    public void methodeA(){
       MonServeur.getInstance().defaultPrint("A");
    }
    
    public void methodeB(){
        MonServeur.getInstance().publicPrint("B");
    }
}
