/* The "BoardFoot" that uses decision statements
*
* @author  Hussein
* @version 1.0
* @since 2020-11-23
*/

import java.util.Scanner;

/**
* This is the standard "GuessGame" program.
*/

final class BoardFoot {

    /**
    * Declaring exponent variable.
    */
    public static final int NUMB = 7;
    /**
    * Declaring exponent variable.
    */
    public static final int NUMBB = 6;
    /**
    * Declaring exponent variable.
    */
    public static final String SPACE = "\n";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private BoardFoot() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting...
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Checks if there is an Invalid Input.
        try {

            // Create a scanner object 1
            final Scanner myObj = new Scanner(System.in);
            System.out.print("This program figures out the Length of a "
                               + "wooden board that is 1 bourd foot "
                               + "in dimension." 
                               + "(1 board foot is 144 inches³ of wood.)"
                               + SPACE);
            // Create a scanner object 2
            System.out.print(SPACE + "Enter the width(inch): ");
            final double UserInputWidth = myObj.nextDouble();
            // Create a scanner object 2
            System.out.print("Enter the height(inch): ");
            final double UserInputHeight = myObj.nextDouble();

            // Calling the Function
            double Calculation =  BoardFoot(UserInputWidth, UserInputHeight);
            System.out.print(SPACE + "The wood should be "
                                   + Calculation
                                   + " inch(es) long."
                                   + SPACE);

        } catch (java.util.InputMismatchException errorCode) {
            // Invalid Input.
            System.out.println("Something was not a number.");
        }
        System.out.println(SPACE + "Done.");
    }

    public static double BoardFoot(double width, double height) {
        // calculation
        double calculation = width * height;
        double finalcalc = 144 / calculation; 
        // return value
        return finalcalc;
    }

}