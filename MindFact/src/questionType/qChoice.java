/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionType;

import mindfact.choiceQuestion;

/**
 *
 * @author Jeekkee
 */
public class qChoice implements qType{
    
    public void Type(String question, int sec, String diff, String differ){
        String diff2 = diff;
        choiceQuestion n = new choiceQuestion();
        new choiceQuestion(question, sec, differ).setVisible(true);
        //choiceQuestion cQ = new choiceQuestion();
        choiceQuestion.diff3 = diff2;
        //cQ.new choiceQuestion(questionQ, secS).setVisible(true);
        System.out.println("kango");
        System.out.println(sec);
    }
    
//    public void type(questionQ, secS, differ){
//        String diff2 = diff;
//        choiceQuestion n = new choiceQuestion();
//        new choiceQuestion(questionQ, secS, differ).setVisible(true);
//        //choiceQuestion cQ = new choiceQuestion();
//        choiceQuestion.diff3 = diff2;
//        //cQ.new choiceQuestion(questionQ, secS).setVisible(true);
//        System.out.println("kango");
//        System.out.println(secS);
//    }
  
}
