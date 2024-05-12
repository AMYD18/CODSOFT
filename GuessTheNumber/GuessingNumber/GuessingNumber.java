import java.util.Scanner;
import java.util.Random;

public class GuessingNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the Guess the Number Game!");
//        we mention maximum Attemps is 5
        while (playAgain) {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 6;

            System.out.println("I've picked a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in " + attempts + " attempts!");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Guissing No. is Too Low!");
                } else {
                    System.out.println("Guissing No. is Too High");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
            }

            System.out.print("Do you want to play again? (y/n):");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
