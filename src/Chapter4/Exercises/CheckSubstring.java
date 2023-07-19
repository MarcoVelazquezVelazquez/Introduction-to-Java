package Chapter4.Exercises;

import java.util.Scanner;

//4.22 (Check substring) Write a program that prompts the user to enter two strings, and
//reports whether the second string is a substring of the first string.
public class CheckSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string s1: ");

        String s1 = input.next();

        System.out.println("Enter string s2: ");

        String s2 = input.next();

        if (s1.contains(s2)){
            System.out.println(s2 + " is a substring of " + s1);
        }
        else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }
}
