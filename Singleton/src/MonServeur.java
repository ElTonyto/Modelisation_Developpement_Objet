/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpedrero
 */
public class MonServeur {
    
    private ServiceA serviceA;
    private ServiceB serviceB;
    private MonServeur instance = new MonServeur( serviceA, serviceB);
    
    
    private MonServeur(ServiceA sA, ServiceB sB){
        this.serviceA = sA;
        this.serviceB = sB;
    }
    
    protected void defaultPrint(String m){
        return "defaultPrint "+ m + "\n";
    }
    
    public void publicPrint(String m){
        return "publicPrint "+ m + "\n";
    }
    
    public ServiceAInterface getServiceAInterface(){
        return ;
    }
    
    public ServiceBInterface getServiceBInterface(){
        return ;
    }
    
    public ServiceA getServicdeA(){
        return serviceA;
    }
    
}
