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
public class Evenement {
    
    private int niveauUrgence;
    private String description;
    
    public Evenement(int niveauUrgence, String description){
        this.description = description;
        this.niveauUrgence = niveauUrgence;
    }
    
    public String toString(){
        return "Niveau urgence=" + niveauUrgence 
                + "description" + description.toString();
        
    }
    
    public int getNiveauUrgence(){
        return this.niveauUrgence;
    }
    
    public String getDescription(){
        return this.description;
    }
}