package Chapter5.Exercises;
// 5.1 (Count positive and negative numbers and compute the average of numbers)
//Write a program that reads an unspecified number of integers, determines how
//many positive and negative values have been read, and computes the total and average of the input values (not counting zeros). Your program ends with the input
//0. Display the average as a floating-point number.
import java.util.Scanner;

public class CountPositiveAndNegativeNumbersAndComputeTheAverageOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        int positives = 0;
        int negatives = 0;
        int sum = 0;

        while (number != 0) {
            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            }
            sum += number;
            System.out.println("Enter an integer, the input ends if it is 0: ");
            number = input.nextInt();
        }


        if (positives + negatives > 0){
            double total = sum;
            double average = sum / (positives + negatives);
            System.out.println("The number of positives is: " + positives);
            System.out.println("The number of negatives is: " + negatives);

            System.out.println("The total is: " + total);
            System.out.println("The average is: " + average);
        }
        else {
            System.out.println("No numbers are entered except 0");
        }


    }
}
