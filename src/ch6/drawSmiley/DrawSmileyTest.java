package ch6.drawSmiley;

import javax.swing.*;

public class DrawSmileyTest {
    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(530, 550);
        app.setVisible(true);
    }
}
