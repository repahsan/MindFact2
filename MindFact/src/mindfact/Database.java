/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindfact;
import java.sql.*;
/**
 *
 * @author Jeekkee
 */
public class Database {
    public static Connection conn;
    public static Statement st;
    public static ResultSet rs;
    public static Database dbc;
    /**
     *
     */
    
    public Database(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mindfact?zeroDateTimeBehavior=convertToNull","root","");
            this.st = this.conn.createStatement();
            System.out.println("DB connected");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static Database getDatabase(){
        
        if(dbc==null){
            dbc = new Database();
        }
        
        return dbc;
    }
    
//    public void getData(){
//        try{
//            String sql = "select * from questions";
//            rs = st.executeQuery(sql);
//            System.out.println("records");
//            while(rs.next()){
//                int id = rs.getInt("question_id");
//                String question = rs.getString("question");
//                System.out.println("ID: "+id+"  "+"question: "+question);
//            }
//        }catch(Exception ex){
//            System.out.println("no data");
//        }
//    }
}
