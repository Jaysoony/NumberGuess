package net.jdevelopmental;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int numberToGuess = rand.nextInt(1000);
        int numberofTries = 3;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false) {

            System.out.println("Guess a number between 1 and 1000: ");
            guess = input.nextInt();
            numberofTries++;

            if (guess == numberToGuess) {
                win = true;

            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high");
            }
        }
    }
}
