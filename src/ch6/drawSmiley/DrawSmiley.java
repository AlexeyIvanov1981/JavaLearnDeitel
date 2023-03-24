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
            int width = ran.nextInt(250);
            int height = ran.nextInt(250);
            int x = ran.nextInt(250) + 1;
            int y = ran.nextInt(250) + 1;
            int ovalOrRestOrRoundRect = ran.nextInt(3) + 1;

            if (ovalOrRestOrRoundRect == 1) {
                g.setColor(new Color(a, b, c));
                g.fillOval(x, y, width, height);
            }
            if (ovalOrRestOrRoundRect == 2) {
                g.setColor(new Color(a, b, c));
                g.fillRect(x, y, width, height);
            }
            if (ovalOrRestOrRoundRect == 3) {
                g.setColor(new Color(a, b, c));
                g.fillRoundRect(x, y, width, height, 10, 10);
            }
            ++counter;
        }
    }
}
