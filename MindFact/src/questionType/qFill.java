/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionType;

import mindfact.fillQuestion;

/**
 *
 * @author Jeekkee
 */
public class qFill implements qType{
    
    public void Type(String question, int sec, String diff, String differ) {
        
        new fillQuestion(question, sec).setVisible(true);
    }
}
