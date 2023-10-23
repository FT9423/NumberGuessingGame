import java.util.Scanner;

public class numberGuessingGame {
    public static void guessingNumberGame() {
        //Scanner for user input
        Scanner num = new Scanner(System.in);
        //Generate random number between designated range '1-100'
        int number = 1 + (int)(100 * Math.random()) ;

        //Amount of attempts user will have to guess number
        int X = 5;

        int i, guess;

        System.out.println("A random number between 1 to 100 has been chosen.");
        System.out.println("Guess the mystery number within 5 attempts to win!");

        for (i = 0; i < X; i++) {
            System.out.println("Enter your guess:");

            //Receive users input
            guess = num.nextInt();

            // If user correctly guesses number
            if (number == guess) {
                System.out.println("Congratulations!"
                + "You guessed the number.");
                //Terminates loop and advances to next statement
                break;
            }
            else if (number > guess && i != X -1) {
                System.out.println("The mystery number is greater than " + guess);
            }
            else if (number < guess && i != X - 1) {
                System.out.println("The mystery number is less than " + guess);
            }
        }
        if (i == X) {
            System.out.println("You have exceeded the 5 attempts.");
            System.out.println("The mystery number was " + number + "!");
        }
    }
    public static void main (String[] args){
        //Calling method
        guessingNumberGame();
    }
}
