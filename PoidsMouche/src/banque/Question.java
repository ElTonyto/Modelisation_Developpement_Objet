/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

/**
 *
 * @author tpedrero
 */
public abstract class Question {

    private String description;

    public Question(String description){
        this.description = description;
    }
    
    protected String getDescription(){
        return this.description;
        
    }
    
    public String toString(){
        return this.description.toString();
    }
}
