/*
 * Josh Bartlett
 * February 14, 2020
 * Assignment 3.1
 * Bellevue University
 * Lottery.java
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[]args) {
        // Create objects of Scanner and Random classes
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        // Declare variable to determine whether or not to play again
        int playAgain = 1;
        // While loop to loop menu
        while (playAgain == 1) {
            // Game menu with an input to determine whether to play game or quit
            System.out.println("\nWelcome to Lottery Game! \nGame Menu \n1. Play Game \n2. Quit");
            System.out.print("Please enter the number of your selection: ");
            playAgain = input.nextInt();
            System.out.println();
            // if statement to check if player wants to play
            if (playAgain == 1) {
                // Variables to track number of correct guesses and to hold the score achieved
                int correct = 0,
                    score = 0;
                // Declare variables for and Generate 4 random numbers
                int rNum1 = random.nextInt(10);
                int rNum2 = random.nextInt(10);
                int rNum3 = random.nextInt(10);
                int rNum4 = random.nextInt(10);
                // Ask for and declares variables for user guesses, saves user guesses in the variables
                System.out.print("Enter 1st Number (0 - 9): ");
                int num1 = input.nextInt();
                System.out.print("Enter 2nd Number (0 - 9): ");
                int num2 = input.nextInt();
                System.out.print("Enter 3rd Number (0 - 9): ");
                int num3 = input.nextInt();
                System.out.print("Enter 4th Number (0 - 9): ");
                int num4 = input.nextInt();
                // if statements to check user input against the random numbers
                if (num1 == rNum1) {
                    correct += 1;
                }
                if (num1 == rNum2) {
                    correct += 1;
                }
                if (num1 == rNum3) {
                    correct += 1;
                }
                if (num1 == rNum4) {
                    correct += 1;
                }
                if (num2 == rNum1) {
                    correct += 1;
                }
                if (num2 == rNum2) {
                    correct += 1;
                }
                if (num2 == rNum3) {
                    correct += 1;
                }
                if (num2 == rNum4) {
                    correct += 1;
                }
                if (num3 == rNum1) {
                    correct += 1;
                }
                if (num3 == rNum2) {
                    correct += 1;
                }
                if (num3 == rNum3) {
                    correct += 1;
                }
                if (num3 == rNum4) {
                    correct += 1;
                }
                if (num4 == rNum1) {
                    correct += 1;
                }
                if (num4 == rNum2) {
                    correct += 1;
                }
                if (num4 == rNum3) {
                    correct += 1;
                }
                if (num4 == rNum4) {
                    correct += 1;
                }
                // switch statement to determine score
                switch (correct) {
                    case 0:
                        score = 0;
                        break;
                    case 1:
                        score = 5;
                        break;
                    case 2:
                        score = 100;
                        break;
                    case 3:
                        score = 2000;
                        break;
                    case 4:
                        score = 1000000;
                        break;
                    default:
                        break;
                }
                // NumberFormat to include commas in necessary scores
                NumberFormat format = NumberFormat.getInstance(new Locale("en_US"));
                // Display user's guesses, random numbers, and score
                System.out.println("\nGuessed Numbers: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
                System.out.println("Random Numbers:  " + rNum1 + ", " + rNum2 + ", " + rNum3 + ", " + rNum4);
                System.out.println("Score: " + format.format(score) + " points");
            }
        }
    }
}