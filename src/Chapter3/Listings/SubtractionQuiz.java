package Chapter3.Listings;
// Listing 3.3 SubtractionQuiz.java

//1. Generate two single-digit integers into number1 and number2.
//2. If number1 < number2, swap number1 with number2.
//3. Prompt the student to answer, "What is number1 − number2?"
//4. Check the student’s answer and display whether the answer is correct.

// To swap two variables number1 and number2, a temporary variable temp (line 11) is used
//to first hold the value in number1. The value in number2 is assigned to number1 (line 12),
//and the value in temp is assigned to number2 (line 13).

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        // 1. Generate two random single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;

            number1 = number2;
            number2 = temp;
        }

        // 3. Prompt the student to answer "What is number1 – number2?"
        System.out.print
                ("What is " + number1 + " − " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 4. Grade the answer and display the result
        if (number1 - number2 == answer)
        System.out.println("You are correct!");
         else{
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " − " + number2 +
                    " should be " + (number1 - number2));
        }
    }
}