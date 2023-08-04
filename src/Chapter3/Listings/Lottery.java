package Chapter3.Listings;
//Listing 3.8 Lottery
// The program generates a lottery using the random() method (line 6) and prompts the user
//to enter a guess (line 11). Note guess % 10 obtains the last digit from guess and guess
///10 obtains the first digit from guess, since guess is a two-digit number (lines 18 and 19).
//The program checks the guess against the lottery number in this order:
//1. First, check whether the guess matches the lottery exactly (line 24).
//2. If not, check whether the reversal of the guess matches the lottery (lines 26 and 27).
//3. If not, check whether one digit is in the lottery (lines 29–32).
//4. If not, nothing matches and display "Sorry, no match" (lines 34 and 35).
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        // Generate a lottery number
        int lottery = (int) (Math.random() * 100);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}