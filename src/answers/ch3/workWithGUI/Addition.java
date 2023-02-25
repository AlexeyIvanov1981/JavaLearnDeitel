package answers.ch3.workWithGUI;


import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Addition {
    public static void main(String[] args) {
        int number1;
        int number2;
        int sum;

        number1 = parseInt(JOptionPane.showInputDialog("enter number1"));

        number2 = parseInt(JOptionPane.showInputDialog("enter number2"));

        sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "Sum is: " + sum);

    }
}
