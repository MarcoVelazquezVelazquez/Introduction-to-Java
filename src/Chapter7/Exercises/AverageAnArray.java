package Chapter7.Exercises;

import java.util.Scanner;

//7.8 (Average an array) Write two overloaded methods that return the average of an
//array with the following headers:
//public static double average(int[] array)
//public static double average(double[] array)
// Write a test program that prompts the user to enter 10 integers, invokes the first
//method, then displays the average value; prompts the user to enter 10 double
//values, invokes the second method, then displays the average value.
public class AverageAnArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");

        int[] numberInt = new int[10];

        for (int i = 0; i < numberInt.length; i++){
            numberInt[i] = input.nextInt();
        }

        System.out.println("Enter 10 double: ");

        double[] numberDouble = new double[10];

        for (int i = 0; i < numberDouble.length; i++){
            numberDouble[i] = input.nextDouble();
        }

        System.out.println("The average of the int numbers is: " + average(numberInt));

       System.out.println("The average of the double numbers is: " + average(numberDouble));

    }

    public static double average(int[] array){

        int count = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
            count++;
        }
        int average = sum / count;

        return (int) average;
    }

   public static double average(double[] array){

        int sum = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

       return sum / array.length;
   }

}
