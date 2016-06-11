package KeyboardInput;

import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class MoreUserInputOfData {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String fName, lName, login;
        int grade, studentID;
        double gPA;

        System.out.print("Please enter the following information so I can sell it for a profit!\n");

        System.out.print("Your fist name    : \n");
        fName = scn.next();
        System.out.print("Your second name  : \n");
        lName = scn.next();
        System.out.print("Grade(9-12)       : \n");
        grade = scn.nextInt();
        System.out.print("StudentID         : \n");
        studentID = scn.nextInt();
        System.out.print("Login             : \n");
        login = scn.next();
        System.out.print("GPA (0.0-4.0)     : \n");
        gPA = scn.nextDouble();

        System.out.print("Your Information  : \n");

        System.out.println("Login    : " + login);
        System.out.println("ID       : " + studentID);
        System.out.println("Name     : " + fName + " " + lName);
        System.out.println("GPA      : " + gPA);
        System.out.println("Grade    : " + grade);

    }
}
