package GUIs;

import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class TwoMoreQuestions {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String firstAnswer, secondAnswer;

        System.out.println("TWO MORE QUESTIONS, BABY!\n");
        System.out.println("Think of something and I'll try to guess it!\n");

        System.out.println("Question 1) Does it stay inside or outside or both?\n");
        firstAnswer = scn.next();

        System.out.println("Question 2) Is it a living thing?\n");
        secondAnswer = scn.next();

        if (firstAnswer.equalsIgnoreCase("both") && (secondAnswer.equalsIgnoreCase("no"))) {
            System.out.println("Obviously the nonliving, inside/outside thing on your mind is a dead ant!\n");
        } else if (firstAnswer.equalsIgnoreCase("outside") && (secondAnswer.equalsIgnoreCase("yes"))) {
            System.out.println("Then what else could you be thinking of besides a python?!?\n");
        } else if (firstAnswer.equalsIgnoreCase("both")) {
            System.out.println("Jembut");
        }

    }
}


