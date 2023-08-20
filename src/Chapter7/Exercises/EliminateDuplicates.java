package Chapter7.Exercises;

import java.util.Scanner;

//7.15 (Eliminate duplicates) Write a method that returns a new array by eliminating the
//duplicate values in the array using the following method header:
//public static int[] eliminateDuplicates(int[] list)
// Write a test program that reads in 10 integers, invokes the method, and displays
//the distinct numbers separated by exactly one space. Here is a sample run of the
//program:
public class EliminateDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inputArray = new int[10];

        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            inputArray[i] = input.nextInt();
        }

        int[] distinctArray = eliminateDuplicates(inputArray);

        System.out.print("Distinct numbers: ");
        for (int i = 0; i < distinctArray.length; i++) {
            if (distinctArray[i] != 0) {
                System.out.print(distinctArray[i] + " ");
            }
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctArray = new int[list.length];
        int size = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < size; j++) {
                if (list[i] == distinctArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                distinctArray[size] = list[i];
                size++;
            }
        }

        int[] result = new int[size];
        System.arraycopy(distinctArray, 0, result, 0, size);

        return result;
    }
}