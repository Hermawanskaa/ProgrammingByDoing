package IfStatements;

import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class HowOldAreYou2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
        name = scn.next();

        System.out.print("Ok," + name + ", how old are you? ");
        age = scn.nextInt();

        if (age < 16) {
            System.out.print("You can't drive.");
        } else if (age < 17) {
            System.out.print("You can drive but not vote.");
        } else if (age >= 18 && age < 24) {
            System.out.print("You can vote but not rent a car.");
        } else if (age > 25) {
            System.out.print("You can do pretty much anything.");
        }


    }
}
