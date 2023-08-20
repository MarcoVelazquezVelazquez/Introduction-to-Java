package Chapter7.Exercises;

import java.util.Scanner;

//7.10 (Find the index of the smallest element) Write a method that returns the index of
//the smallest element in an array of integers. If the number of such elements is
//greater than 1, return the smallest index. Use the following header:
//public static int indexOfSmallestElement(double[] array)
// Write a test program that prompts the user to enter 10 numbers, invokes this
//method to return the index of the smallest element, and displays the index.
public class FindTheIndexOfTheSmallestElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.println("Enter 10 integers: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The index of the smallest element in an array of integers is: " + indexOfSmallestElement(array));

    }

    public static int indexOfSmallestElement(double[] array){

        double min = array[0];
        int indexOfTheSmallestElement = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                indexOfTheSmallestElement = i;
            }
        }

        return indexOfTheSmallestElement;
    }

}
