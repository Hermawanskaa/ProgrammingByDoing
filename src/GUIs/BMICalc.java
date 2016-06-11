package GUIs;


import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class BMICalc {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Your height in inches: ");
        int height = keyboard.nextInt();

        System.out.print("Your weight in pounds: ");
        int pounds = keyboard.nextInt();

        String category = new String();

        double totalheight = (height * height);
        double bmi = (pounds / totalheight * 703);
        if (bmi < 15) {
            System.out.println(category = "very severely underweight\n");
        } else if (bmi >= 15.0 && bmi <= 16.0) {
            System.out.println(category = "severely underweight\n");
        } else if (bmi >= 16.1 && bmi <= 18.4) {
            System.out.println(category = "undeweight\n");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println(category = "normal weight\n");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println(category = "overweight\n");
        } else if (bmi >= 30.0 && bmi <= 34.9) {
            System.out.println(category = "moderately obese\n");
        } else if (bmi >= 35.0 && bmi <= 39.9) {
            System.out.println(category = "severely obese\n");
        } else if (bmi >= 40.0) {
            System.out.println(category = "very severely (or \"morbidly\") obese\n");
        }


        System.out.println("Your BMI is : " + bmi);
        System.out.println("BMI Category: " + category);


    }
}
