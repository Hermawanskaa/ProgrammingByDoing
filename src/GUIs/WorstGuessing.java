package GUIs;

/**
 * @author bambang
 */

import java.util.Scanner;

public class WorstGuessing {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int angka = 4;
        int input;
        System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
        input = scn.nextInt();

        if (input != angka) {
            System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS 4!");
        } else if (input == angka) {
            System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS 4!");
            System.out.println("/me walks away shaking his head....");
        }


    }
}
