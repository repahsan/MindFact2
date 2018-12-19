/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindfact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
/**
 *
 * @author Gibert Dan
 */
public class submitChoice extends javax.swing.JFrame {
    Connection conn = null;
    Controller cont = new Controller();
    /**
     * Creates new form submitChoice
     */
    public submitChoice() {
        initComponents();
        initializer();
        groupButton();
    }
    public void choiceBox()
    {
        initComponents();
        initializer();
    }
    public void initializer(){
        JComboBox combo2 = new JComboBox();
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Easy","Medium","Hard"}));
    }
    private void groupButton(){
        Database.getDatabase();
        String radioText = "";
        //int correct = 1;
        ButtonGroup bg1 = new ButtonGroup( );
            bg1.add(button1);
            bg1.add(button2);
            bg1.add(button3);
            bg1.add(button4);
       
        if(button1.isSelected())
        {
            try{
            int correct = 1;
            String sql = "INSERT INTO choices(letter,correct) VALUES ('a','"+correct+"')";
            Statement st = Database.conn.prepareStatement(sql);
            st.executeUpdate(sql);
            correctAns.setText("a");
            }catch(Exception e){
                System.out.println("ERROR");
            }
        }
        if(button2.isSelected())
        {
            try{
            int correct = 1;
            String sql = "INSERT INTO choices(letter,correct) VALUES ('b','"+correct+"')";
            Statement st = Database.conn.prepareStatement(sql);
            st.executeUpdate(sql);
            correctAns.setText("b");
            }catch(Exception e){
                System.out.println("ERROR");
            }
        }
        if(button3.isSelected())
        {
            try{
            int correct = 1;    
            String sql = "INSERT INTO choices(letter,correct) VALUES ('c','"+correct+"')";
            Statement st = Database.conn.prepareStatement(sql);
            st.executeUpdate(sql);
            correctAns.setText("c");
            }catch(Exception e){
                System.out.println("ERROR");
            }
        }
        if(button4.isSelected())
        {
            try{
            int correct = 1;
            String sql = "INSERT INTO choices(letter,correct) VALUES ('d','"+correct+"')";
            Statement st = Database.conn.prepareStatement(sql);
            st.executeUpdate(sql);
            correctAns.setText("d");
            }catch(Exception e){
                System.out.println("ERROR");
            }
        }

}
 

    /**public submitChoice(int secS) {
       String para = null;
        int i = 0;
         try{
            //String sql = "select * into choices where question_id = "+secS+" and  difficulty = 'easy'";
            java.sql.Statement st = conn.createStatement();
            //st.executeUpdate("INSERT INTO choices()")
            //connect.rs = connect.st.executeQuery(sql);
            while(connect.rs.next()){
                System.out.println("Connected S");
                String choice = connect.rs.getString("letter");
                st.executeUpdate("INSERT INTO questions where difficulty(easy)VALUES('"+this.questionField.getText()+"')");
                if(choice == "a")
                {
                    st.executeUpdate("INSERT INTO choices where letter(a)VALUES('"+this.choiceA.getText()+"')");
                    //String sql = "insert * into choices where letter = 'a'";
                }
                if(choice == "b")
                {
                    st.executeUpdate("INSERT INTO choices where letter(b)VALUES('"+this.choiceB.getText()+"')");
                    //String sql = "insert * into choices where letter = 'a'";
                }
                if(choice == "c")
                {
                    st.executeUpdate("INSERT INTO choices where letter(c)VALUES('"+this.choiceC.getText()+"')");
                    //String sql = "insert * into choices where letter = 'a'";
                }
                if(choice == "d")
                {
                    st.executeUpdate("INSERT INTO choices where letter(d)VALUES('"+this.choiceD.getText()+"')");
                    System.out.println("D: "+choiceD);
                    //String sql = "insert * into choices where letter = 'a'";
                }
            }
        }catch(Exception ex){
            System.out.println("no data");
        }
    }
    
    public void submitQuestion(int secS)
    {
         try{
            java.sql.Statement st = conn.createStatement();
            while(connect.rs.next()){
                System.out.println("Connected Q");
                st.executeUpdate("INSERT INTO questions where question_id = "+secS+" and difficulty(easy)VALUES('"+this.questionField.getText()+"')");
            }
         }catch(Exception ex){
            System.out.println("no data");
        }
    }**/
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionField = new javax.swing.JTextArea();
        choiceAA = new javax.swing.JButton();
        choiceAA1 = new javax.swing.JButton();
        choiceAA2 = new javax.swing.JButton();
        choiceAA3 = new javax.swing.JButton();
        choiceA = new javax.swing.JTextField();
        choiceC = new javax.swing.JTextField();
        choiceD = new javax.swing.JTextField();
        choiceB = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        button1 = new javax.swing.JRadioButton();
        button2 = new javax.swing.JRadioButton();
        button3 = new javax.swing.JRadioButton();
        button4 = new javax.swing.JRadioButton();
        correctAns = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        questionField.setColumns(20);
        questionField.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        questionField.setRows(5);
        questionField.setText("Type question here...");
        questionField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questionFieldMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(questionField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 740, 190));

        choiceAA.setText("A");
        choiceAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceAAActionPerformed(evt);
            }
        });
        getContentPane().add(choiceAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 373, 49, 50));

        choiceAA1.setText("C");
        choiceAA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceAA1ActionPerformed(evt);
            }
        });
        getContentPane().add(choiceAA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 49, 50));

        choiceAA2.setText("D");
        choiceAA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceAA2ActionPerformed(evt);
            }
        });
        getContentPane().add(choiceAA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 49, 50));

        choiceAA3.setText("B");
        choiceAA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceAA3ActionPerformed(evt);
            }
        });
        getContentPane().add(choiceAA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 49, 50));

        choiceA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceAActionPerformed(evt);
            }
        });
        getContentPane().add(choiceA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 270, 40));
        getContentPane().add(choiceC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 270, 40));

        choiceD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceDActionPerformed(evt);
            }
        });
        getContentPane().add(choiceD, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 280, 40));
        getContentPane().add(choiceB, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 280, 40));

        jButton1.setText("Submin Question");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, -1, 50));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy\t", "Medium", "Hard" }));
        jComboBox2.setName(""); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, 50));

        button1.setText("Answer");
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        button2.setText("Answer");
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, -1));

        button3.setText("Answer");
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, -1, -1));

        button4.setText("Answer");
        getContentPane().add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 620, -1, -1));

        correctAns.setText("Answer:");
        correctAns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correctAnsMouseClicked(evt);
            }
        });
        correctAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctAnsActionPerformed(evt);
            }
        });
        getContentPane().add(correctAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 690, 110, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/papebackgrnd.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choiceAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceAAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceAAActionPerformed

    private void choiceAA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceAA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceAA1ActionPerformed

    private void choiceAA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceAA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceAA2ActionPerformed

    private void choiceAA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceAA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceAA3ActionPerformed

    private void choiceDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       String questiones = questionField.getText();
       //String Achoice = choiceA.getText();
       //String Bchoice = choiceB.getText();
       //String Cchoice = choiceC.getText();
       //String Dchoice = choiceD.getText();
       
       System.out.println("Question: "+questiones);
       String difficulty = (String)jComboBox2.getSelectedItem();
       char a = correctAns.getText().toCharArray()[0];
       Database.getDatabase();
       //show_combobox_selected.setText(difficulty);
       
       try{
           if(difficulty == "Easy")
           {
               
            String sql = "INSERT INTO easyquestions(question, difficulty, type) VALUES ('"+questiones+"', 'easy', 'multiple choice')";
            Statement st = Database.conn.prepareStatement(sql);
            st.executeUpdate(sql);
            
            String qry = "SELECT * FROM easyquestions WHERE question = '"+questiones+"'";
            Statement ste = Database.conn.prepareStatement(qry);
            ResultSet rs = ste.executeQuery(qry);
            
            int q = 0;
            
            while(rs.next()){
                q = rs.getInt("question_id");
            }
   
            int correctA = 0;
            //char a = correctAns.getText().toCharArray()[0];
            System.out.println(q);
            
            for(int i = 0; i < 4; i++){
                System.out.println("nisud");
                if(i == 0){
                   if(a == 'a'){
                    correctA = 1;
                    String sql2 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','a','"+choiceA.getText()+"','easy',"+correctA+")";
                    Statement st1 = Database.conn.prepareStatement(sql2);
                    
                    st1.executeUpdate(sql2);
                    }else if(a != 'a'){
                        correctA = 0;
                        String sql6 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','a','"+choiceA.getText()+"','easy',"+correctA+")";
                        Statement st5 = Database.conn.prepareStatement(sql6);
                        st5.executeUpdate(sql6);
                    } 
                }else if(i == 1){
                    if(a == 'b'){
                        correctA = 1;
                        String sql3 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','b','"+choiceB.getText()+"','easy',"+correctA+")";
                        Statement st2 = Database.conn.prepareStatement(sql3);
                        st2.executeUpdate(sql3);
                    }else if(a != 'b'){
                        correctA = 0;
                        String sql7 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','b','"+choiceB.getText()+"','easy',"+correctA+")";
                        Statement st6 = Database.conn.prepareStatement(sql7);
                        st6.executeUpdate(sql7);
                    } 
                }else if(i == 2){
                    if(a == 'c'){
                        correctA = 1;
                        String sql4 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','c','"+choiceC.getText()+"','easy',"+correctA+")";
                        Statement st3 = Database.conn.prepareStatement(sql4);
                        st3.executeUpdate(sql4);
                    }else if(a != 'c'){
                        correctA = 0;
                        String sql8 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','c','"+choiceC.getText()+"','easy',"+correctA+")";
                        Statement st7 = Database.conn.prepareStatement(sql8);
                        st7.executeUpdate(sql8);
                    } 
                }else if(i == 3){
                    if(a == 'd'){
                        correctA = 1;
                        String sql5 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','d','"+choiceD.getText()+"','easy',"+correctA+")";
                        Statement st4 = Database.conn.prepareStatement(sql5);
                        st4.executeUpdate(sql5);
                    }else if(a != 'd'){
                        correctA = 0;
                        String sql9 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','d','"+choiceD.getText()+"','easy',"+correctA+")";
                        Statement st8 = Database.conn.prepareStatement(sql9);
                        st8.executeUpdate(sql9);
                    }
                }
                dispose();
            }
          }
           }catch(Exception e){
            System.out.println("ERROR NO DATA");
            System.out.println(e);
            dispose();
       }
           
           
           try{
           if(difficulty == "Medium")
           {
               
            String sql = "INSERT INTO mediumquestions(question, difficulty, type) VALUES ('"+questiones+"', 'medium', 'multiple choice')";
            Statement st = Database.conn.prepareStatement(sql);
            st.executeUpdate(sql);
            
            String qry = "SELECT * FROM mediumquestions WHERE question = '"+questiones+"'";
            Statement ste = Database.conn.prepareStatement(qry);
            ResultSet rs = ste.executeQuery(qry);
            
            int q = 0;
            
            while(rs.next()){
                q = rs.getInt("question_id");
            }
   
            int correctA = 0;
            //char a = correctAns.getText().toCharArray()[0];
            System.out.println(q);
            
            for(int i = 0; i < 4; i++){
                System.out.println("nisud");
                if(i == 0){
                   if(a == 'a'){
                    correctA = 1;
                    String sql2 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','a','"+choiceA.getText()+"','"+difficulty+"',"+correctA+")";
                    Statement st1 = Database.conn.prepareStatement(sql2);
                    st1.executeUpdate(sql2);
                    }else if(a != 'a'){
                        correctA = 0;
                        String sql6 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','a','"+choiceA.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st5 = Database.conn.prepareStatement(sql6);
                        st5.executeUpdate(sql6);
                    } 
                }else if(i == 1){
                    if(a == 'b'){
                        correctA = 1;
                        String sql3 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','b','"+choiceB.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st2 = Database.conn.prepareStatement(sql3);
                        st2.executeUpdate(sql3);
                    }else if(a != 'b'){
                        correctA = 0;
                        String sql7 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','b','"+choiceB.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st6 = Database.conn.prepareStatement(sql7);
                        st6.executeUpdate(sql7);
                    } 
                }else if(i == 2){
                    if(a == 'c'){
                        correctA = 1;
                        String sql4 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','c','"+choiceC.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st3 = Database.conn.prepareStatement(sql4);
                        st3.executeUpdate(sql4);
                    }else if(a != 'c'){
                        correctA = 0;
                        String sql8 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','c','"+choiceC.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st7 = Database.conn.prepareStatement(sql8);
                        st7.executeUpdate(sql8);
                    } 
                }else if(i == 3){
                    if(a == 'd'){
                        correctA = 1;
                        String sql5 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','d','"+choiceD.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st4 = Database.conn.prepareStatement(sql5);
                        st4.executeUpdate(sql5);
                    }else if(a != 'd'){
                        correctA = 0;
                        String sql9 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','d','"+choiceD.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st8 = Database.conn.prepareStatement(sql9);
                        st8.executeUpdate(sql9);
                    }
                }
            }
          }
            dispose();
        }catch(Exception e){
            System.out.println("ERROR NO DATA");
            System.out.println(e);
            dispose();
       }
           
           
            try{
           if(difficulty == "Hard")
           {
               
            String sql = "INSERT INTO hardquestions(question, difficulty, type) VALUES ('"+questiones+"','"+difficulty+"', 'multiple choice',)";
            Statement st = Database.conn.prepareStatement(sql);
            st.executeUpdate(sql);
            
            String qry = "SELECT * FROM hardquestions WHERE question = '"+questiones+"'";
            Statement ste = Database.conn.prepareStatement(qry);
            ResultSet rs = ste.executeQuery(qry);
            
            int q = 0;
            
            while(rs.next()){
                q = rs.getInt("question_id");
            }
   
            int correctA = 0;
            //char a = correctAns.getText().toCharArray()[0];
            System.out.println(q);
            
            for(int i = 0; i < 4; i++){
                System.out.println("nisud");
                if(i == 0){
                   if(a == 'a'){
                    correctA = 1;
                    String sql2 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','a','"+choiceA.getText()+"','"+difficulty+"',"+correctA+")";
                    Statement st1 = Database.conn.prepareStatement(sql2);
                    st1.executeUpdate(sql2);
                    }else if(a != 'a'){
                        correctA = 0;
                        String sql6 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','a','"+choiceA.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st5 = Database.conn.prepareStatement(sql6);
                        st5.executeUpdate(sql6);
                    } 
                }else if(i == 1){
                    if(a == 'b'){
                        correctA = 1;
                        String sql3 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','b','"+choiceB.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st2 = Database.conn.prepareStatement(sql3);
                        st2.executeUpdate(sql3);
                    }else if(a != 'b'){
                        correctA = 0;
                        String sql7 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','b','"+choiceB.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st6 = Database.conn.prepareStatement(sql7);
                        st6.executeUpdate(sql7);
                    } 
                }else if(i == 2){
                    if(a == 'c'){
                        correctA = 1;
                        String sql4 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','c','"+choiceC.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st3 = Database.conn.prepareStatement(sql4);
                        st3.executeUpdate(sql4);
                    }else if(a != 'c'){
                        correctA = 0;
                        String sql8 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','c','"+choiceC.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st7 = Database.conn.prepareStatement(sql8);
                        st7.executeUpdate(sql8);
                    } 
                }else if(i == 3){
                    if(a == 'd'){
                        correctA = 1;
                        String sql5 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','d','"+choiceD.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st4 = Database.conn.prepareStatement(sql5);
                        st4.executeUpdate(sql5);
                    }else if(a != 'd'){
                        correctA = 0;
                        String sql9 = "INSERT INTO choices(question_id,letter,answer,difficulty, correct) VALUES('"+q+"','d','"+choiceD.getText()+"','"+difficulty+"',"+correctA+")";
                        Statement st8 = Database.conn.prepareStatement(sql9);
                        st8.executeUpdate(sql9);
                    }
                }
            }
          }
            dispose();
        }catch(Exception e){
            System.out.println("ERROR NO DATA");
            System.out.println(e);
            dispose();
       }
           
           
   

         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        //JComboBox combo1 = new JComboBox();
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void choiceAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceAActionPerformed

    private void correctAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctAnsActionPerformed
        //correctAns.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_correctAnsActionPerformed

    private void correctAnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correctAnsMouseClicked
        correctAns.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_correctAnsMouseClicked

    private void questionFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionFieldMouseClicked
        // TODO add your handling code here:
        questionField.setText("");
    }//GEN-LAST:event_questionFieldMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(submitChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(submitChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(submitChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(submitChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {    
                new submitChoice().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton button1;
    private javax.swing.JRadioButton button2;
    private javax.swing.JRadioButton button3;
    private javax.swing.JRadioButton button4;
    private javax.swing.JTextField choiceA;
    private javax.swing.JButton choiceAA;
    private javax.swing.JButton choiceAA1;
    private javax.swing.JButton choiceAA2;
    private javax.swing.JButton choiceAA3;
    private javax.swing.JTextField choiceB;
    private javax.swing.JTextField choiceC;
    private javax.swing.JTextField choiceD;
    private javax.swing.JTextField correctAns;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea questionField;
    // End of variables declaration//GEN-END:variables
}
