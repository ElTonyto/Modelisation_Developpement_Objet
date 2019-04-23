/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructeur;

import java.util.ArrayList;

/**
 *
 * @author tpedrero
 */
public abstract class Contrat {
    protected ArrayList<String> documents;
    
    public Contrat(){
        documents = new ArrayList<>();
    }
    
    public void ajouteDocument(String document){
        this.documents.add(document);
    }
    
    public abstract void imprime();
}
