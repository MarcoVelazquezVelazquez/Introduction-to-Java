package Chapter4.Exercises;

import java.util.Scanner;

//4.20 (Process a string) Write a program that prompts the user to enter a string and
//displays its length and its first character.
public class ProcessAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = input.nextLine();

        System.out.println("The length of the string " + s + " is " + s.length());
        System.out.println("The first character of the string " + s + " is " + s.charAt(0));
    }
}
