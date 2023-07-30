package Chapter5.Listings;

import java.util.Scanner;

//5.41 (Occurrence of max numbers) Write a program that reads integers, finds the largest of them, and counts its occurrences. Assume the input ends with number 0.
//Suppose you entered 3 5 2 5 5 5 0; the program finds that the largest is 5 and
//the occurrence count for 5 is 4. If no input is entered, display "No numbers are
//entered except 0".
//(Hint: Maintain two variables, max and count. max stores the current max
//number and count stores its occurrences. Initially, assign the first number to
//max and 1 to count. Compare each subsequent number with max. If the number is greater than max, assign it to max and reset count to 1. If the number is
//equal to max, increment count by 1.)
public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int count = 1;

        System.out.println("Enter integers (input ends with number 0)");

        while (true) {
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }

            //System.out.println("No numbers are entered except 0");
        }

        System.out.println(max);
        System.out.println(count);

    }

}