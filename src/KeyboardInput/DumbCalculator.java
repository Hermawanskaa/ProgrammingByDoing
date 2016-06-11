package KeyboardInput;

import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class DumbCalculator {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int fNumber, sNumber, tNumber;

        System.out.println("What is your first number?\n");
        fNumber = scn.nextInt();
        System.out.println("What is your second number?\n");
        sNumber = scn.nextInt();
        System.out.println("What is your third number?\n");
        tNumber = scn.nextInt();


        System.out.println(fNumber + " + " + sNumber + " + " + tNumber + " is " + (fNumber + sNumber + tNumber));
    }
}
