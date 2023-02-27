package ch4.drawPanel;

import javax.swing.*;

public class DrawPanelTest {
    public static void main(String[] args) {

        DrawPanel drawPanel = new DrawPanel();

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.add(drawPanel);
        app.setSize(250, 250);
        app.setVisible(true);
    }
}
