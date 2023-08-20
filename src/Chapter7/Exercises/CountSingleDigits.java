package Chapter7.Exercises;

import java.util.Scanner;

//*7.7 (Count single digits) Write a program that generates 100 random integers between
//0 and 9 and displays the count for each number. (Hint: Use an array of 10 integers,
//say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
public class CountSingleDigits {

    public static void main(String[] args) {

     /*   int[] counts = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] randomIntegers = new int[10];

        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = (int) (Math.random() * 9) + 1;
            System.out.println(randomIntegers[i]);
        }*/

        int number;
        int[] occurrences = new int[10];

        for (int i = 0; i < 100; i++) {
            number = (int) (Math.random() * 9) + 1;
            occurrences[number]++;
        }


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