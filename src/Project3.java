/*
 * Programmer Name: Marcus Brown
 * Class Name: Project3
 * Date: 3/13/2023
 * Course CIS1500 A1513
 * Purpose Statement: Produce an applicatiion that converts meters to kilometers, feet, or inches.
 */
import java.util.Scanner;


public class Project3 {

    // variables that wont change throughout program.
    public static final double kilometersPerMeter = 0.001;
    public static final double inchesPerMeter = 39.37;
    public static final double feetPerMeter = 3.281;
    public static void main(String[] args)  {
        int meters;
        int convert;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter meters below.");
        meters = keyboard.nextInt();

        // Makes user put only positive integers
        while(meters < 0){
            System.out.println("Please enter a positive value for meters:");
            meters = keyboard.nextInt();
        }

        // Gets menu number from user
        do{
            menu();
            convert = keyboard.nextInt();

        // Switch statement to pass meters through respective conversion as argument. Only allowing menu numbers 1-4
        switch(convert){
            case 1: showKilometers(meters);
                break;
            
            case 2: showInches(meters);
                break;
            
            case 3: showFeet(meters);
                break;
            
            case 4: System.out.println("\nBye!");
                break;

            default:
                System.out.println("You have entered an invalid number");

        }

        }while(convert != 4);   // End program if 4 is input to the program.
    }

    // Conversion Menu
    public static void menu() {
        System.out.println("\n1. Convert to kilometers.");
        System.out.println("2. Convert to inches.");
        System.out.println("3. Convert to feet.");
        System.out.println("4. Quit the program.");
        System.out.print("\nEnter your choice: ");
    }
    //Converts Meters to Kilometers
    public static void showKilometers(int meters) {
        double kilo = meters * kilometersPerMeter;
        System.out.println("\n" + meters + " meters is " + kilo + " kilometers.\n");
    }

    // Converts meters to inches
    public static void showInches(int meters) {
        double inches = meters * inchesPerMeter;
        System.out.println("\n" + meters + " meters is " + inches + " inches.\n");
        
    }

    // converts meters to feet
    public static void showFeet(int meters) {
        double feet = meters * feetPerMeter;
        System.out.println("\n" + meters + " meters is " + feet + " feet.\n");
        
    }
}
