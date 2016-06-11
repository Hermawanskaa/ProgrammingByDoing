package IfStatements;

/**
 * @author Hermawanska
 */
public class HowOldAreYou {

    public static void main(String[] args) {
        int age1 = 30;

        if (age1 < 16) {
            System.out.print("You can't drive.\n");
        }

        if (age1 < 18) {
            System.out.print("You can't vote.\n");
        }

        if (age1 < 25) {
            System.out.print("You can't rent a car.\n");
        }

        if (age1 > 25) {
            System.out.print("You can do anything that's legal.\n");
        }

    }
}
