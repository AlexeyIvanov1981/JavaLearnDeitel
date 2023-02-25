package ch3.workWithGUI;


import javax.swing.*;

public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name? ");

        String message = String.format("Hello %s! Welcome to Java!!!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
