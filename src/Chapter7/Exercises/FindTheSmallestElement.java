package Chapter7.Exercises;

import java.util.Scanner;

//7.9 (Find the smallest element) Write a method that finds the smallest element in an
//array of double values using the following header:
//public static double min(double[] array)
// Write a test program that prompts the user to enter 10 numbers, invokes this
//method to return the minimum value, and displays the minimum value. Here is a
//sample run of the program:
public class FindTheSmallestElement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        System.out.println("The minimum number is: " + min(array));

    }

    public static double min(double[] array){

        double min = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
