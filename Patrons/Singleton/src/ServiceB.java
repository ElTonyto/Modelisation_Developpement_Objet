/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpedrero
 */
public class ServiceB extends Service implements ServiceBInterface{

    public ServiceB() {
    }
    
    public void methodeC(){
        MonServeur.getInstance().defaultPrint("C");
    }
    
    @Override
    public void methodeD(){
        MonServeur.getInstance().publicPrint("D");
    }
    
    @Override
    public void methodeE(){
        MonServeur.getInstance().getServiceAInterface().methodeA();
    }
    
    @Override
    public void methodeF(){
        MonServeur.getInstance().getServiceA().methodeB();
    }
}
