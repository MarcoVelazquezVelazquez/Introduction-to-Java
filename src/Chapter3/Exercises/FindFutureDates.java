package Chapter3.Exercises;

import java.util.Scanner;

//(Find future dates) Write a program that prompts the user to enter an integer for
//today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
//prompt the user to enter the number of days after today for a future day and display
// the future day of the week. Here is a sample run:
public class FindFutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6): ");
        int day = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();

        int futureDay = (day + daysElapsed) % 7;

        switch (futureDay) {
            case 0:
                System.out.println("Today is " + day + " and the future day is Sunday");
                break;
            case 1:
                System.out.println("Today is " + day + " and the future day is Monday");
                break;
            case 2:
                System.out.println("Today is " + day + " and the future day is Tuesday");
                break;
            case 3:
                System.out.println("Today is " + day + " and the future day is Wednesday");
                break;
            case 4:
                System.out.println("Today is " + day + " and the future day is Thursday");
                break;
            case 5:
                System.out.println("Today is " + day + " and the future day is Friday");
                break;
            case 6:
                System.out.println("Today is " + day + " and the future day is Saturday");
                break;
        }
    }
}