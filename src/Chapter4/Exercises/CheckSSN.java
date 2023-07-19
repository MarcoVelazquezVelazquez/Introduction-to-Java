package Chapter4.Exercises;

import java.util.Scanner;

//4.21 (Check SSN) Write a program that prompts the user to enter a Social Security
//number in the format DDD-DD-DDDD, where D is a digit. Your program should
//check whether the input is valid. Here are sample runs
public class CheckSSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a SSN: ");

        String ssn = input.next();

        int length = 11;

        if (ssn.length() == length){
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }
    }
}


   /*SOLUCIÓN CON PATRÓN DE STRING

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Social Security number (format: DDD-DD-DDDD): ");
        String ssn = scanner.nextLine();

        // Regular expression pattern for SSN validation
        String pattern = "\\d{3}-\\d{2}-\\d{4}";

        // Check if the input matches the pattern
        if (ssn.matches(pattern)) {
            System.out.println("Valid SSN");
        } else {
            System.out.println("Invalid SSN");
        }
    }
}
*/