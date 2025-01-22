/*
Students Name: Amwaj Ahmed - Layan Talal
IDs: 445001427 - 445001291
Group: 39
*/

package app;

import java.util.Scanner;
import java.util.Random;

public class App {
    // Constant to store the program name
    final static String PROGRAM = "Simple Operations Program";

    // Method to generate incremental output
    public static void generateIncrementalOutput(int start, int end) {
        if (start < end) {
            // Loop from start to end, incrementing by 5 each time
            for (int i = start; i <= end; i += 5) {
                System.out.print(i + " "); // Print the current number
            }
            System.out.println(); // Move to the next line after printing
        } else {
            // Print error message if start is not smaller than end
            System.out.println("Error: The first integer must be smaller than the second integer");
        }
    }

    // Method for the number guessing game
    public static boolean guessingNumber(int number) {
        Random rng = new Random(); // Create a Random object
        int randomNumber = rng.nextInt(100) + 1; // Generate a random number between 1 and 100
        Scanner input = new Scanner(System.in); // Create a Scanner object

        while (true) {
            // Check if the number is within the valid range (1 to 100)
            if (number >= 1 && number <= 100) {
                if (number == randomNumber) {
                    // If the guess is correct, print success message and return true
                    System.out.println("Congratulations!");
                    return true;
                } else if (number < randomNumber) {
                    // If the guess is too low, ask the user to try again
                    System.out.println("Too low! Try again");
                } else {
                    // If the guess is too high, ask the user to try again
                    System.out.println("Too high! Try again");
                }
            } else {
                // If the number is outside the valid range, print an error message
                System.out.println("Please enter a number between 1 and 100.");
            }

            // Ask the user to enter a new guess
            System.out.print("Guess a number between 1 and 100: ");
            number = input.nextInt(); // Read the new guess
        }
    }

    // Main method where the program starts
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        // Print the program name
        System.out.println(PROGRAM);

        // Ask the user to enter two numbers
        System.out.println("Please ensure that the second number is larger than the first number.");
        System.out.print("Enter the first number: ");
        int start = input.nextInt(); // Read the first number
        System.out.print("Enter the second number: ");
        int end = input.nextInt(); // Read the second number

        // Generate and print the incremental output
        generateIncrementalOutput(start, end);

        // Ask the user to enter a number for the guessing game
        System.out.print("Guess a number between 1 and 100: ");
        int number = input.nextInt(); // Read the initial guess

        // Start the guessing game
        guessingNumber(number);
    }
}
