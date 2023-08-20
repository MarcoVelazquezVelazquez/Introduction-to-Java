package Chapter7.Exercises;

import java.util.Scanner;

//**7.5 (Print distinct numbers) Write a program that reads in 10 numbers and displays the
//number of distinct numbers and the distinct numbers in their input order and separated by
// exactly one space (i.e., if a number appears multiple times, it is displayed
//only once). (Hint: Read a number and store it to an array if it is new. If the number is
//already in the array, ignore it.) After the input, the array contains the distinct numbers.
//Here is the sample run of the program:
public class PrintDistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfDistinctNumbers;
        int distinctNumbers;

        int number;
        int[] occurrences = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter 10 integers: ");
            number = input.nextInt();
            occurrences[number]++;
        }

        System.out.println("The number of distinct numbers is: ");
        System.out.println("The distinct numbers are: ");

        System.out.println("The occurrences of each number are: ");
        for (int i = 0; i < 10; i++){
            if (occurrences[i] > 0) {
                System.out.print(i + " occurs " + occurrences[i] + " time");
                if (occurrences[i] > 1) {
                    System.out.print("s");
                }
                System.out.println();
            }
        }

    }
}
