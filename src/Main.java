import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lower = 1, upper = 100;
        int randomNumber = random.nextInt(upper - lower + 1) + lower;
        int attempts = 0;
        int guess = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("✅ Correct! You guessed it in " + attempts + " attempts.");
            }
        }
        sc.close();
    }
}