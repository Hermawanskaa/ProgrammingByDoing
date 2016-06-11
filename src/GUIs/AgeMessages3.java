package GUIs;

import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class AgeMessages3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int age;
        String name;

        System.out.println("Input your name : ");
        name = scn.next();
        System.out.println("Input your age  : \n\n");
        age = scn.nextInt();

        System.out.println("Your name: " + name + "\nYour age: " + age);

        if (age <= 16) {
            System.out.println("You can't drive. " + name);
        } else if (age >= 16 && age <= 17) {
            System.out.println("You can drive but not vote.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("You can vote but not rent a car. " + name);
        } else if (age >= 25) {
            System.out.print("You can do pretty much anything.");
        }
    }

}

