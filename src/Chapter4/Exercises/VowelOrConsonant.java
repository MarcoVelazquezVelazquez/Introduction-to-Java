package Chapter4.Exercises;

import java.util.Scanner;

//4.13 (Vowel or consonant?) Write a program that prompts the user to enter a letter and
//check whether the letter is a vowel or consonant. For a nonletter input, display
//invalid input. Here is a sample run:
public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");

        char letter = input.nextLine().toLowerCase().charAt(0);

        if (Character.isLetter(letter)){
            if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u')){
                System.out.println(letter + " is a vowel");
            }
            else {
                System.out.println(letter + " is a consonant");
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
