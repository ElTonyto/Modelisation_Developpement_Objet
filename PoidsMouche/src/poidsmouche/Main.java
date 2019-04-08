/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poidsmouche;

import banque.Evaluation;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author tpedrero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        final int NB_ETUDIANTS = 149;
        ArrayList<Evaluation> mesEvaluationsAndroid = new ArrayList<Evaluation>();
        
        //creation des evaluations
        for(int x = 1; x <= NB_ETUDIANTS; x++){
            mesEvaluationsAndroid.add(new Evaluation(x, genererIdQuestion(), genererIdQuestion()));
        } 
        
        //affichage des evaluations
        for(Evaluation evaluation : mesEvaluationsAndroid){
            System.out.println(evaluation);
        }
    }

    private static char genererIdQuestion() {
        return (char) (ThreadLocalRandom.current().nextInt(65, 68));
    }
}
