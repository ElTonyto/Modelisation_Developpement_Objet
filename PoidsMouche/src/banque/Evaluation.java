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
public class Evaluation {

    private int noEvaluation;
    private Question q1;
    private Question q2;

    public Evaluation(int noEvaluation, char idQ1, char idQ2) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        this.noEvaluation = noEvaluation;
        this.q1 = banque.Banque.getInstance().chargerQuestion(idQ1);
        this.q2 = banque.Banque.getInstance().chargerQuestion(idQ2);
    }

    public String toString() {
        return "Evaluation #" + noEvaluation + "\n" 
                + "q1 Question(" + q1 + ") \n"
                + "q2 Question(" + q2 + ") \n";
    }
}
