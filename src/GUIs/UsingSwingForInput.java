package GUIs;

import javax.swing.*;

/**
 * @author Hermawanska
 */
public class UsingSwingForInput {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String input = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(input);

        System.out.print("Hello, " + name + ".");
        String age1 = "";
        System.out.println("Next year, you'll be " + (age + 1));
        System.exit(0);
    }
}
