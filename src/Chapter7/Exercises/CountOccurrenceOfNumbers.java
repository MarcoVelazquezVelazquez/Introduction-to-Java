package Chapter7.Exercises;
//PENDIENTE
import java.util.Scanner;

//**7.3 (Count occurrence of numbers) Write a program that reads the integers between
//1 and 100 and counts the occurrences of each. Assume the input ends with 0. Here
//is a sample run of the program: Note that if a number occurs more than one time, the
//plural word “times” is used in the output. Numbers are displayed in increasing order
public class CountOccurrenceOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numberOfOccurrences = new int[101];

        int numberOfIntegers;

        do {
            System.out.println("Enter scores: ");
            numberOfIntegers = input.nextInt();
            if (numberOfIntegers >= 1 && numberOfIntegers <= 100) {
               numberOfOccurrences[numberOfIntegers]++;
            }
        } while (numberOfIntegers != 0);

        System.out.println("The occurrences of each number are: ");
        for (int i = 0; i <= 100; i++){
            if (numberOfOccurrences[i] > 0) {
                System.out.print(i + " occurs " + numberOfOccurrences[i] + " time");
                if (numberOfOccurrences[i] > 1) {
                    System.out.print("s");
                }
                System.out.println();
            }
        }
    }
}