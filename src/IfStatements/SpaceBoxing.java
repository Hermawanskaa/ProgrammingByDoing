package IfStatements;

import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class SpaceBoxing {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int answer1, answer2, answer3, hasil;

        System.out.print("Q1) What is the capital of Alaska?\n1) Melbourne\n2) Anchorage\n3) Juneau\n ");
        answer1 = scn.nextInt();

        if (answer1 == 3) {
            System.out.print("That's correct!\n");
        } else if (answer1 != 3) {
            System.out.print("incorrect\n");
        }


        System.out.print("Q2) Can you store the value \"cat\" in a variable of type int?\n1) yes\n2) no\n ");
        answer2 = scn.nextInt();

        if (answer2 == 2) {
            System.out.print("That's correct!\n");
        } else if (answer2 != 2) {
            System.out.print("Sorry, \"cat\" is a string. ints can only store numbers.\n");
        }


        System.out.print("Q3) What is the result of 9+6/3?\n1) 5\n2) 11\n3) 15/3\n ");
        answer3 = scn.nextInt();

        if (answer3 == 2) {
            System.out.print("That's correct!");
        } else if (answer3 != 2) {
            System.out.print("Incorrect!");
        }


        System.out.print("Overall, you got+(answer1+answer2+answer3)\nThanks for playing!");


    }

}
