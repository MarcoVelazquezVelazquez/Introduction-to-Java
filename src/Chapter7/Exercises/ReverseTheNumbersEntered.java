package Chapter7.Exercises;

import java.util.Scanner;

//7.2 (Reverse the numbers entered) Write a program that reads 10 integers then displays
// them in the reverse of the order in which they were read.
public class ReverseTheNumbersEntered {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        System.out.println("The reverse of the order in which they were read is: ");

        for (int i = 9; i >= 0 ;i--){
            System.out.print(numbers[i] + "");
        }
        System.out.println();



    }





}
