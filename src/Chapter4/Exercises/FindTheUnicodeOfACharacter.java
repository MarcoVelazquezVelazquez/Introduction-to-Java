package Chapter4.Exercises;
// *.9 (Find the Unicode of a character) Write a program that receives a character and
//displays its Unicode. Here is a sample run:
import java.util.Scanner;

public class FindTheUnicodeOfACharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");

        //Reading char from the console
        char code = input.next().charAt(0);

        System.out.println("The Unicode for the character " + code + " is: " + (int) code);

    }
}

