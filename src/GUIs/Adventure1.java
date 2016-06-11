package GUIs;

import java.util.Scanner;

/**
 * @author Hermawanska
 */
public class Adventure1 {

    public static void main(String[] args) {

        String firstOption, secondOption, thirdOption;
        Scanner scn = new Scanner(System.in);

        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!\n");
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?\n>\n");
        firstOption = scn.next();
        if (firstOption.equalsIgnoreCase("kitchen")) {
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\".\n>\n");
            secondOption = scn.next();

            if (secondOption.equalsIgnoreCase("refrigenerator")) {
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")\n>\n");
            }

            thirdOption = scn.next();
            if (thirdOption.equalsIgnoreCase("yes")) {

            } else if (thirdOption.equalsIgnoreCase("no")) {
                System.out.println("You die of starvation... eventually.");
            }
        } else if (firstOption.equalsIgnoreCase("upstairs")) {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?\n>\n");
            secondOption = scn.next();
            if (secondOption.equalsIgnoreCase("bedroom")) {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")\n>\n");
                thirdOption = scn.next();
                if (thirdOption.equalsIgnoreCase("yes")) {

                } else if (thirdOption.equalsIgnoreCase("no")) {
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.\n>\n");
                } else {
                }
            }

        }

    }

}

