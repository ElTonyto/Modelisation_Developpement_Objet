/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

import java.util.HashMap;

/**
 *
 * @author tpedrero
 */
public class Banque {

    private HashMap<Character, Question> questions;
    private static Banque banque = new Banque();

    public static Banque getInstance() {
        return banque;

    }

    private Banque() {
        
    }

    private Question getQuestion(char id) {
        return questions.get(id);

    }

    private Question chargerQuestion(char id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Question question = null;
        try{
            Class<Question> classeQuestion = (Class<Question>) Class.forName("banque.Question" + id);
            question = classeQuestion.newInstance();
            questions.put(id, question);
        } catch (Exception e){
            e.printStackTrace();
        }
        return question;
    }
}
