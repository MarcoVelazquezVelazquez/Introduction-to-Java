package Chapter3.Listings;
// Listing 3.7 LeapYear.java
// A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.
//A leap year has 366 days. The February of a leap year has 29 days. You can use the following
//Boolean expressions to check whether a year is a leap year:
//// A leap year is divisible by 4
//boolean isLeapYear = (year % 4 == 0);
//// A leap year is divisible by 4 but not by 100
//isLeapYear = isLeapYear && (year % 100 != 0);
//// A leap year is divisible by 4 but not by 100 or divisible by 400
//isLeapYear = isLeapYear || (year % 400 == 0);
//Or you can combine all these expressions into one as follows:
//isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display the result
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}