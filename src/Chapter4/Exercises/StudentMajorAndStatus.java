package Chapter4.Exercises;

import java.util.Scanner;

//4.18 (Student major and status) Write a program that prompts the user to enter two
//characters and displays the major and status represented in the characters. The
//first character indicates the major and the second is a number character 1, 2, 3, or
//4, which indicates whether a student is a freshman, sophomore, junior, or senior.
//Suppose that the following characters are used to denote the majors:
//M: Mathematics
//C: Computer Science
//I: Information Technology
public class StudentMajorAndStatus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String majorAndStatus = input.next().toUpperCase();
        char major = majorAndStatus.charAt(0);
        char number = majorAndStatus.charAt(1);

        if (major == 'M') {
            if (number == '1') {
                System.out.println("Mathematics Freshman");
            } else if (number == '2') {
                System.out.println("Mathematics Sophomore");
            } else if (number == '3') {
                System.out.println("Mathematics Junior");
            } else if (number == '4') {
                System.out.println("Mathematics Senior");
            } else {
                System.out.println("Invalid input");
            }
        } else if (major == 'C') {
            if (number == '1') {
                System.out.println("Computer Science Freshman");
            } else if (number == '2') {
                System.out.println("Computer Science Sophomore");
            } else if (number == '3') {
                System.out.println("Computer Science Junior");
            } else if (number == '4') {
                System.out.println("Computer Science Senior");
            } else {
                System.out.println("Invalid input");
            }
        } else if (major == 'I') {
            if (number == '1') {
                System.out.println("Information Technology Freshman");
            } else if (number == '2') {
                System.out.println("Information Technology Sophomore");
            } else if (number == '3') {
                System.out.println("Information Technology Junior");
            } else if (number == '4') {
                System.out.println("Information Technology Senior");
            } else {
                System.out.println("Invalid input");
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }
}


/* Solución del libro
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String s = input.nextLine();

        if (s.charAt(0) == 'M')
            System.out.print("Mathematics ");
        else if (s.charAt(0) == 'C')
            System.out.print("Computer Science ");
        else if (s.charAt(0) == 'I')
            System.out.print("Information Technology ");
        else {
            System.out.println("Invalid input: Wrong major code");
            System.exit(1);
        }

        if (s.charAt(1) == '1')
            System.out.println("Freshman");
        else if (s.charAt(1) == '2')
            System.out.println("Sophomore");
        else if (s.charAt(1) == '3')
            System.out.println("Junior");
        else if (s.charAt(1) == '4')
            System.out.println("Senior");
        else {
            System.out.println("Invalid input: wrong status code");
            System.exit(2);
        }
    }
}
*/

