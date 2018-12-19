/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindfact;

/**
 *
 * @author twinslagemi
 */
public class stopper {
    private static int stop = 0;
    
     public static int getStopper() {
        stop += 1;
        System.out.println("Stopper count: " + stop);
        if (stop == 2) {
            Database.getDatabase();
            Controller control= new Controller();
            title t = new title();

            try {
                String sql = "UPDATE userscore SET score= WHERE score=0";
                new leaderBoards().setVisible(true);
                Database.st.executeUpdate(sql);
            } catch (Exception ex) {
                System.out.println(ex);
            }

        }
        return stop;
    }
}
