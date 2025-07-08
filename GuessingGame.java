import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = new Random().nextInt(100) + 1;
        List<Integer> guesses = new ArrayList<>();
        int tries = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();
            
            if (guesses.contains(guess)) {
                System.out.println("You already guessed that number!");
                continue;
            }
            
            guesses.add(guess);
            tries++;
            
            if (guess < secretNumber) {
                System.out.println("Too small!");
            } else if (guess > secretNumber) {
                System.out.println("Too large!");
            } else {
                System.out.println("Congratulations! You guessed the secret number in " + tries + " tries.");
                break;
            }
        }
        
        scanner.close();
    }
}