package Chapter2.Exercises;

import java.util.Scanner;

//Exercise 2.3 (Convert feet into meters) Write a program that reads a number in feet, converts it
//to meters, and displays the result. One foot is 0.305 meter.
public class ConvertFeetIntoMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a measure in feet");
        double feet = input.nextDouble();

        double meters = feet * 0.305;
        System.out.println(feet + " feets " + " are " + meters + " meters");
    }
}
