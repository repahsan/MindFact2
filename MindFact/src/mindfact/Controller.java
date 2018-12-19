/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindfact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.*;
import questionType.qChoice;
import questionType.qEnum;
import questionType.qFill;
/**
 *
 * @author Libanan
 */
public class Controller {
    int score = 0;
    int correct = 1;
    
    public static String diff = null;
    public static String differ = null;
    Randomizer rand = new Randomizer();
    
    //Database connect = new Database();
    public void getQuestions(){
        System.out.println(diff);
        Database.getDatabase();
        try{
            String sql = "select * from "+diff+" where question_id = "+rand.n+"";
            Database.rs = Database.st.executeQuery(sql);
            while(Database.rs.next()){
                String question = Database.rs.getString("question");
                String qType = Database.rs.getString("type");
                int sec = Database.rs.getInt("question_id");
                
                //questionType q = new questionType(question, sec, diff, differ, qType);
                
                
                switch(qType) {
                    case "multiple choice":
                        qChoice a = new qChoice();
                                a.Type(question, sec, diff, differ);
                        break;
                        
                    case "fill in the blanks":
                        qFill b = new qFill();
                              b.Type(question, sec, diff, differ);
                        break;
                        
                    case "enumeration":
                        qEnum c = new qEnum();
                              c.Type(question, sec, diff, differ);
                        break;
                    }
                System.out.println("question random");
                System.out.println(sec);
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        
    }
//    public void getChoices(){
//                System.out.println("question random");
//                System.out.println(rand.n);
//        
//    }
    public void OptionPane1() {  
            JFrame f;
            f=new JFrame();  
            JOptionPane.showMessageDialog(f,"Correct!");  
            }
    public void OptionPane0() {  
            JFrame f;
            f=new JFrame();  
            JOptionPane.showMessageDialog(f,"Wrong!");  
            }
//    public void getChoice(){
//        try{
//            String sql = "select * from choices where question_id = 1";
//            connect.rs = connect.st.executeQuery(sql);
//            while(connect.rs.next()){
//                String question = connect.rs.getString("answer");
//                
//                new choiceQuestion(question);
//            }
//        }catch(Exception ex){
//            System.out.println("no data");
//        }
//    }
}
