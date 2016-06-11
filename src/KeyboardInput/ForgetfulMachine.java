package KeyboardInput;

import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class ForgetfulMachine {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String oneword,
                twoword;
        int favnumb,
                twofavnumb;


        System.out.print("Give me a word!\n");
        oneword = scn.next();

        System.out.print("Give me a second word!\n");
        twoword = scn.next();

        System.out.print("Great, now your favorite number?\n");
        favnumb = scn.nextInt();

        System.out.print("And your second-favorite number..\n");
        twofavnumb = scn.nextInt();

        System.out.println("Your full name is " + oneword + " " + twoword + " and your favorite number are " + favnumb + " and " + twofavnumb + "\n");
        System.out.println("Whew!  Wasn't that fun?");
    }
}
