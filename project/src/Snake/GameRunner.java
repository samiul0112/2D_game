package Snake;

import javax.swing.*;

public class GameRunner {

    // Developer Info
    private static final String NAME = "MD SAMIUL ISLAM";
    private static final String ID = "17101419";

    public static void main(String[] args) {

        // Create a new instance of the game
        SnakeView f1= new SnakeView();

        //Setting up the window settings
        f1.setTitle("Snake Game by " + NAME + "," + "ID:" + ID);
        f1.setSize(700,700);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}