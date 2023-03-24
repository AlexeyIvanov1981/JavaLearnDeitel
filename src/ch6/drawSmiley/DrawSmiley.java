package ch6.drawSmiley;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;


public class DrawSmiley extends JPanel {
    SecureRandom ran = new SecureRandom();

    public void paintComponent(Graphics g) {


        super.paintComponent(g);
        int counter = 1;

        while (counter <= 10) {
            int a = ran.nextInt(255) + 1;
            int b = ran.nextInt(255) + 1;
            int c = ran.nextInt(255) + 1;
//            int d = ran.nextInt(255) + 1;
//            int e = ran.nextInt(255) + 1;
//            int f = ran.nextInt(255) + 1;
            int ovalOrRest = ran.nextInt(1);

            if (ovalOrRest == 0) {
                g.setColor(new Color(a, b, c));
                g.fillOval(10, 10, 200, 200);
            }
            if (ovalOrRest == 1) {
                g.setColor(new Color(a, b, c));
                g.fillRect(100, 100, 200, 200);
            }
            ++counter;
        }
    }
}
