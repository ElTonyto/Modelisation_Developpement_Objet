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
public class Ketchup extends MalbouffeDecorateur{
    
    public Ketchup(Malbouffe malbouffe) {
        super(malbouffe);
    }
    
    public String getDescription(){
        return "ketchup";
    }
    
}
