/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindfact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author vildo
 */
public class enumerationQuestion extends javax.swing.JFrame {

    /**
     * Creates new form enumerationQuestion
     */
    public enumerationQuestion() {
        initComponents();
    }

    public enumerationQuestion(String questionQ, int secS) {
        initComponents();
        questionField.setText(questionQ);
        questionField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answerField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionField = new javax.swing.JTextArea();
        scoreBoard = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        answerField.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        answerField.setText("Answer here ...");
        answerField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answerFieldMouseClicked(evt);
            }
        });
        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });
        getContentPane().add(answerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 620, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enum.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 520, 120));

        questionField.setEditable(false);
        questionField.setColumns(20);
        questionField.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        questionField.setRows(5);
        jScrollPane1.setViewportView(questionField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 830, 210));
        getContentPane().add(scoreBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 0, 80, 22));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel3.setText("Tip: Separate your answer with a comma");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 450, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/papebackgrnd.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        Database.getDatabase();
        Controller control = new Controller();
        control.getQuestions();

        try {
            String qr = questionField.getText();
            String sql = "select answer from enumeration as a INNER JOIN easyquestions as b ON a.question_id = b.question_id where b.question = '" + qr + "'";
            Database.rs = Database.st.executeQuery(sql);
            scoreTracker st = new scoreTracker();
            stopper sp = new stopper();

            while (Database.rs.next()) {
                String chosenLetter = Database.rs.getString("answer");

                if (answerField.getText().equals(chosenLetter)) {
                    control.OptionPane1();
                    this.setVisible(false);
                    scoreTracker.getStopper();
                    scoreTracker.getScore();
                    this.setVisible(true);
                    dispose();
                } else {
                    control.OptionPane0();
                    this.setVisible(false);
                    scoreTracker.getStopper();
                    scoreTracker.score();
                    this.setVisible(true);
                    dispose();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        try {
            String qr = questionField.getText();
            String sql = "select answer from enumeration as a INNER JOIN mediumquestions as b ON a.question_id = b.question_id where b.question = '" + qr + "'";
            Database.rs = Database.st.executeQuery(sql);
            scoreTracker st = new scoreTracker();
            stopper sp = new stopper();

            while (Database.rs.next()) {
                String chosenLetter = Database.rs.getString("answer");

               if (answerField.getText().equals(chosenLetter)) {
                    control.OptionPane1();
                    scoreTracker.getStopper();
                    scoreTracker.getScore();
                    dispose();
                } else {
                    control.OptionPane0();
                    scoreTracker.getStopper();
                    scoreTracker.score();
                    dispose();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        try {
            String qr = questionField.getText();
            String sql = "select answer from enumeration as a INNER JOIN hardquestions as b ON a.question_id = b.question_id where b.question = '" + qr + "'";
            Database.rs = Database.st.executeQuery(sql);
            scoreTracker st = new scoreTracker();
            stopper sp = new stopper();

            while (Database.rs.next()) {
                String chosenLetter = Database.rs.getString("answer");

                if (answerField.getText().equals(chosenLetter)) {
                    control.OptionPane1();
                    scoreTracker.getStopper();
                    scoreTracker.getScore();
                    dispose();
                } else {
                    control.OptionPane0();
                    scoreTracker.getStopper();
                    scoreTracker.score();
                    dispose();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        dispose();
    }//GEN-LAST:event_answerFieldActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowActivated

    private void answerFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerFieldMouseClicked
        // TODO add your handling code here:
        answerField.setText("");
    }//GEN-LAST:event_answerFieldMouseClicked

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
            java.util.logging.Logger.getLogger(enumerationQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enumerationQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enumerationQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enumerationQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enumerationQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea questionField;
    private javax.swing.JLabel scoreBoard;
    // End of variables declaration//GEN-END:variables
}
