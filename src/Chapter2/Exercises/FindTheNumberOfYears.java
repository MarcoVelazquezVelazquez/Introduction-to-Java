package Chapter2.Exercises;
// NO TERMINADO
import java.util.Scanner;

// Exercise 2.7 (Find the number of years) Write a program that prompts the user to enter the
//minutes (e.g., 1 billion), and displays the maximum number of years and remaining days for the minutes.
// For simplicity, assume that a year has 365 days
public class FindTheNumberOfYears {

    public static void main(String[] args) {
        // Un año tiene 525600 minutos
        //Un día tiene 1440 minutos

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int years = minutes / 525600;

        int remainingMinutes = minutes / 525600;

        System.out.println("The number of years in " + minutes + " minutes is " + years +
                " and " + remainingMinutes + " days");

    }
}
