package KeyboardInput;


import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class BMICalc {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int height, weight;
        double divide;

        System.out.println("Your height in m    :\n");
        height = scn.nextInt();
        System.out.println("Your weight in kg   :\n");
        weight = scn.nextInt();


        System.out.println("Your BMI is   : " + (weight / height));

    }

}
