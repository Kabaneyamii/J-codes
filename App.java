/*
Students Name: Amwaj Ahmed - Layan Talal
IDs: 445001427 - 445001291
Group: 39
*/
package app;
import java.util.Scanner;
import java.util.Random;

public class App {
    final static String PROGRAM = "Simple Operations Program";

    public static void generateIncrementalOutput(int start, int end) {
        if (start < end) {
            for (int i = start; i <= end; i += 5) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("Error: The first integer must be smaller than the second integer");
        }
    }

    public static Boolean guessingNumber(int number) {
        Random rng = new Random();
        int randomNumber = rng.nextInt(100) + 1;
        if (number == randomNumber) {
            System.out.println("Congratulations!");
            return true;
        } else if (number < randomNumber) {
            System.out.println("Too low!");
            return false;
        } else {
            System.out.println("Too high!");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM");

        System.out.println("Please ensure that the second number is larger than the first number.");
        System.out.println("Enter the first number: ");
        int start = input.nextInt();
        System.out.println("Enter the second number: ");
        int end = input.nextInt();
        generateIncrementalOutput(start, end);

        System.out.println("Guess a number between (1-100): ");
        int number = input.nextInt();
        guessingNumber(number);
    }
}
