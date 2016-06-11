package KeyboardInput;

import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class NameAgeAndSalary {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String name;
        int age, make;

        System.out.print("Hello.  What is your name?\n");
        name = scn.next();
        System.out.print("Hi, " + name + "!  How old are you?\n");
        age = scn.nextInt();
        System.out.print("So you're " + age + ", eh?  That's not old at all!");
        System.out.print("How much do you make," + name + "\n");
        make = scn.nextInt();

        System.out.print(+make + " !  I hope that's per hour and not per year! LOL!\n");
    }
}
