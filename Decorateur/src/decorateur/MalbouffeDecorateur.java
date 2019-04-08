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
public abstract class MalbouffeDecorateur implements Malbouffe{
    private Malbouffe malbouffe;

    public MalbouffeDecorateur(Malbouffe malbouffe) {
        this.malbouffe = malbouffe;
    }
    
    public String getDescription(){
        return malbouffe.getDescription();
    }
    
    
}
