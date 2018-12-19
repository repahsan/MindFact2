/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindfact;

import java.sql.SQLException;

/**
 *
 * @author twinslagemi
 */
public class scoreTracker {

    private static int score = 0;

    private static int stop = 0;

    public static int getScore() {
        score += 10;
        System.out.println("ScoreTracker correct score: " + score);
        return score;
    }

    public static int score() {
        score = score;
        System.out.println("ScoreTracker wrong score: " + score);
        return score;
    }

    public static int getStopper() {
        stop += 1;
        System.out.println("Stopper count: " + stop);
        if (stop == 5) {
            Database.getDatabase();
            Controller control = new Controller();
            title t = new title();

            try {
                String sql = "UPDATE userscore SET score=('" + score + "') WHERE score=0";
                new leaderBoards().setVisible(true);
                Database.st.executeUpdate(sql);
            } catch (Exception ex) {
                System.out.println(ex);
            }

        }
        return stop;
    }

}
