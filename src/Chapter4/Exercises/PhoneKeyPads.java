package Chapter4.Exercises;

import java.util.Scanner;

// 4.15 (Phone key pads) The international standard letter/number mapping found on the
//telephone is shown below: Write a program that prompts the user to enter a lowercase or uppercase letter
// and displays its corresponding number. For a nonletter input, display invalid
//input
public class PhoneKeyPads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = input.next().charAt(0);

        if (Character.isLetter(letter)){
            if (letter == 'a' || letter == 'A'|| letter == 'b'|| letter == 'B'|| letter == 'c'|| letter == 'C'){
                System.out.println("The corresponding number is 2");
            }
            else if (letter == 'd' || letter == 'D'|| letter == 'e'|| letter == 'E'|| letter == 'f'|| letter == 'F'){
                System.out.println("The corresponding number is 3");
            }
            else if (letter == 'g' || letter == 'G'|| letter == 'h'|| letter == 'H'|| letter == 'i'|| letter == 'I'){
                System.out.println("The corresponding number is 4");
            }
            else if (letter == 'j' || letter == 'J'|| letter == 'k'|| letter == 'K'|| letter == 'l'|| letter == 'L'){
                System.out.println("The corresponding number is 5");
            }
            else if (letter == 'm' || letter == 'M'|| letter == 'n'|| letter == 'N'|| letter == 'o'|| letter == 'O'){
                System.out.println("The corresponding number is 6");
            }
            else if (letter == 'p' || letter == 'P'|| letter == 'q'|| letter == 'Q'|| letter == 'r'|| letter == 'R' || letter == 's'|| letter == 'S'){
                System.out.println("The corresponding number is 7");
            }
            else if (letter == 't' || letter == 'T'|| letter == 'u'|| letter == 'U'|| letter == 'v'|| letter == 'V'){
                System.out.println("The corresponding number is 8");
            }
            else if (letter == 'w' || letter == 'W'|| letter == 'x'|| letter == 'X'|| letter == 'y'|| letter == 'Y' || letter == 'z'|| letter == 'Z'){
                System.out.println("The corresponding number is 9");
            }
        }
        else {
            System.out.println("Invalid input"); System.exit(1);
        }
    }
}
