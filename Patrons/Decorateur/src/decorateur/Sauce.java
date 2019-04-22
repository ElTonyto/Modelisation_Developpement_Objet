/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorateur;

/**
 *
 * @author tpedrero
 */
public class Sauce extends MalbouffeDecorateur{
    
    public Sauce(Malbouffe malbouffe) {
        super(malbouffe);
    }
    
    public String getDescription(){
        return super.getDescription() + " avec de la sauce";   
    }
    
}
