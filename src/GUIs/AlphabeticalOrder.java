package GUIs;

/**
 * @author bambang
 */

import java.util.Scanner;

public class AlphabeticalOrder {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String input = "";
        String name = "";

        System.out.println("What's your last name? " + name);
        input = scn.nextLine();

        if (input.equals("Carswell")) {
            System.out.println("It's going to be a while before we get to you," + input);
        } else if (input.equals("Jones")) {
            System.out.println("that's not bad, " + input);
        } else if (input.equals("Smith")) {
            System.out.println("looks like a bit of a wait, " + input);
        } else if (input.equals("Smith")) {
            System.out.println("looks like a bit of a wait, " + input);
        } else if (input.equals("Young")) {
            System.out.println("it's gonna be a while, " + input);
        }

    }
}
