package KeyboardInput;

import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class AgeIn5 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String name;
        int age, ageminus, ageplus;


        System.out.print("Hello.  What is your name?\n");
        name = scn.next();
        System.out.print("Hi," + name + "!  How old are you? \n");
        age = scn.nextInt();
        System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?\n");
        System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");


    }
}
