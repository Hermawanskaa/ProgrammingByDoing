package GUIs;

import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class GenderGame {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        int age;
        String fName, lName,
                gender = "",
                married = "";

        System.out.println("What is your gender (M or F) : ");
        married = scn.nextLine();
        System.out.println("First name : ");
        fName = scn.nextLine();
        System.out.println("Last name : ");
        lName = scn.nextLine();
        System.out.println("Age : ");
        age = scn.nextInt();

        if (age >= 20 && "F".equalsIgnoreCase(gender)) {
            System.out.println("Are you married, Mrs. " + fName + "(Y or N)");
            married = scn.next();

            if (married.equalsIgnoreCase("Y")) {
                System.out.println("Then I shall call you Mrs. " + fName + " " + lName);
            } else if (married.equalsIgnoreCase("N")) {
                System.out.println("Then I shall call you Ms. " + fName + " " + lName);
            }
        } else if (age >= 20 && "".equalsIgnoreCase(gender)) {
            System.out.println("Are you married, Mr. " + fName + "(Y or N)");
            married = scn.next();

            if (married.equalsIgnoreCase("Y")) {
                System.out.println("Then I shall call you Mrs. " + fName + " " + lName);
            } else if (married.equalsIgnoreCase("N")) {
                System.out.println("Then I shall call you " + fName + " " + lName);
            }
        } else if (age < 20 && gender.equalsIgnoreCase("")) {
            System.out.println("Then I shall call you " + fName + " " + lName);
        }


    }
}

