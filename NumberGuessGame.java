
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int max = 100;
        int min = 1;
        int target = rand.nextInt(max - min + 1) + min;
        int guess;
        int attempts = 0;
        System.out.print("Enter the total number of trial : ");
        int trial = input.nextInt();
        System.out.println("Guess a number between 1 and 100");
        boolean correct = false;
        while (trial > 0) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess == target) {
                System.out.println("Congratulations!..... You guessed the correct number in " + attempts + " tiral.");
                break;
            } else if (guess < target) {
                System.out.println("Your guess is lower than the target.");
                trial--;
                System.out.println("You have " + trial + " trial left");
                System.out.println("\n");
            } else {
                System.out.println("Your guess is higher than the target.");
                trial--;
                System.out.println("You have " + trial + " trial left");
                System.out.println("\n");
            }

        }
        if (correct == false) {
            System.out.println("You ran out of tries.\nYou lose!");
        }
    }
}
