<<<<<<<< HEAD:src/answers/ch3/workWithGUI/NameDialog.java
package answers.ch3.workWithGUI;
========
package ch3.workWithGUI;
>>>>>>>> origin/main:src/ch3/workWithGUI/NameDialog.java

import javax.swing.*;

public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name? ");

        String message = String.format("Hello %s! Welcome to Java!!!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
