/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindfact;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;

/**
 *
 * @author Gibert Dan
 */
public class submitEnum extends javax.swing.JFrame {

    /**
     * Creates new form submitEnum
     */
    public submitEnum() {
        initComponents();
        initializer();
    }
    
    public void initializer(){
        JComboBox combo2 = new JComboBox();
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Easy","Medium","Hard"}));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        question = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("Type answer here...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 430, 70));

        nextButton.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        nextButton.setText("Submit");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 120, 50));

        question.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        question.setText("Type question here.....");
        question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionActionPerformed(evt);
            }
        });
        getContentPane().add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 660, 190));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy\t", "Medium", "Hard" }));
        jComboBox3.setName(""); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/papebackgrnd.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        Database.getDatabase();
        Controller control = new Controller();
        String difficulty = (String)jComboBox3.getSelectedItem();
        String answers = jTextField1.getText();
        
        String questiones = question.getText();
        System.out.println("Question: "+questiones);
    if(difficulty == "Easy")
        {
        try{
            String sql2 = "INSERT INTO easyquestions(question, difficulty, type) VALUES ('"+questiones+"', '"+difficulty+"', 'enumeration')";
            Statement st2 = Database.conn.prepareStatement(sql2);
            st2.executeUpdate(sql2);
            
            String sql1 = "SELECT * FROM easyquestions WHERE question = '"+questiones+"'";
            Statement st1 = Database.conn.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery(sql1);
            
            int val = 0;
            
            while(rs.next()){
                val = rs.getInt("question_id");
            }           
            System.out.println(val);
            String sql = "INSERT INTO enumeration(question_id,answer,difficulty) VALUES ('"+val+"','"+jTextField1.getText()+"', '"+difficulty+"')";
            Statement st = Database.conn.prepareStatement(sql);
            st.executeUpdate(sql);

            System.out.println("Connected");
            System.out.println("Answer: "+jTextField1.getText());
            dispose();
        }catch(Exception e)
        {
            System.out.println("ERROR NO DATA");
            System.out.println(e);
            dispose();
       }
    }else if(difficulty == "Medium")
        {
        try{
            String sql2 = "INSERT INTO mediumquestions(question, difficulty, type) VALUES ('"+questiones+"', '"+difficulty+"', 'enumeration')";
            Statement st2 = Database.conn.prepareStatement(sql2);
            st2.executeUpdate(sql2);
            
            String sql1 = "SELECT * FROM mediumquestions WHERE question = '"+questiones+"'";
            Statement st1 = Database.conn.prepareStatement(sql1);
            
            ResultSet rs = st1.executeQuery(sql1);
            int val = 0;
            
            while(rs.next()){
                val = rs.getInt("question_id");
            }
            
            System.out.println(val);
            
            String sql = "INSERT INTO enumeration(question_id, difficulty,answer) VALUES ("+val+", '"+difficulty+"','"+jTextField1.getText()+"')";
            Statement st = Database.conn.prepareStatement(sql);
            st.executeUpdate(sql);

            System.out.println("Connected");
            System.out.println("Answer: "+jTextField1.getText());
            dispose();
        }catch(Exception e)
        {
            System.out.println("ERROR NO DATA");
            System.out.println(e);
            dispose();
       }
    }else if(difficulty == "Hard")
        {
        try{
            String sql2 = "INSERT INTO hardquestions(question, difficulty, type) VALUES ('"+questiones+"', '"+difficulty+"', 'enumeration')";
            Statement st2 = Database.conn.prepareStatement(sql2);
            st2.executeUpdate(sql2);
            
            String sql1 = "SELECT * FROM hardquestions WHERE question = '"+questiones+"'";
            Statement st1 = Database.conn.prepareStatement(sql1);
            
            ResultSet rs = st1.executeQuery(sql1);
            int val = 0;
            
            while(rs.next()){
                val = rs.getInt("question_id");
            }
            
            System.out.println(val);
            
            String sql = "INSERT INTO fill(question_id, difficulty,answer) VALUES ("+val+", '"+difficulty+"','"+jTextField1.getText()+"')";
            Statement st = Database.conn.prepareStatement(sql);
            st.executeUpdate(sql);

            System.out.println("Connected");
            System.out.println("Answer: "+jTextField1.getText());
            dispose();
        }catch(Exception e)
        {
            System.out.println("ERROR NO DATA");
            System.out.println(e);
            dispose();
       }
    }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_questionActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        //JComboBox combo1 = new JComboBox();
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(submitEnum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(submitEnum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(submitEnum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(submitEnum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new submitEnum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField question;
    // End of variables declaration//GEN-END:variables
}
