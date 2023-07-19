package Chapter4.Exercises;

import java.util.Scanner;

//4.8 (Find the character of an ASCII code) Write a program that receives an ASCII code
//(an integer between 0 and 127) and displays its character
public class FindTheCharacterOfAnASCIICode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code: ");
        int code = input.nextInt();

        System.out.println("The character for ASCII code " + code + " is: " + (char) code);

    }
}
