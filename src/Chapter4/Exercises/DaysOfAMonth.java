package Chapter4.Exercises;

import java.util.Scanner;

//4.17 (Days of a month) Write a program that prompts the user to enter the year and the
//first three letters of a month name (with the first letter in uppercase) and displays
//the number of days in the month. If the input for month is incorrect, display a
//message as presented in the following sample runs:
public class DaysOfAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");

        int year = input.nextInt();

        System.out.println("Enter a month: ");

        String month = input.next();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month){
            case "Jan":
                System.out.println(month + " " + year + " has 31 days");break;
            case "Feb": if (isLeapYear){
                System.out.println(month + " " + year + " has 29 days");
            }
            else {
                System.out.println(month + " " + year + " has 28 days");
            }
                break;
            case "Mar":
                System.out.println(month + " " + year + " has 31 days");break;
            case "Apr":
                System.out.println(month + " " + year + " has 30 days");break;
            case "May":
                System.out.println(month + " " + year + " has 31 days");break;
            case "Jun":
                System.out.println(month + " " + year + " has 30 days");break;
            case "Jul":
                System.out.println(month + " " + year + " has 31 days");break;
            case "Ago":
                System.out.println(month + " " + year + " has 31 days");break;
            case "Sep":
                System.out.println(month + " " + year + " has 30 days");break;
            case "Oct":
                System.out.println(month + " " + year + " has 31 days");break;
            case "Nov":
                System.out.println(month + " " + year + " has 31 days");break;
            case "Dec":
                System.out.println(month + " " + year + " has 31 days");break;
            default:
                System.out.println(month + " is not a correct month name");System.exit(1);
        }
    }
}
