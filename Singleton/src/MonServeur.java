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
    
    private static final MonServeur instance = new MonServeur( );
    
    private MonServeur(){
        serviceA = new ServiceA();
        serviceB = new ServiceB();
    }
    
    public static MonServeur getInstance() {
        return instance;
    }
    
    protected void defaultPrint(String m){
        System.out.println("defaultPrint : " + m);
    }
    
    public void publicPrint(String m){
        System.out.println("publicPrint : " + m);
    }
    
    public ServiceAInterface getServiceAInterface(){
        return getServiceA();
    }
    
    public ServiceBInterface getServiceBInterface(){
        return serviceB;
    }
    
    public ServiceA getServiceA(){
        return serviceA;
    }
}
