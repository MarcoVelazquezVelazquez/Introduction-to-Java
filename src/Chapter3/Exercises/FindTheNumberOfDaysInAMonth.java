package Chapter3.Exercises;
//3.11 (Find the number of days in a month) Write a program that prompts the user
//to enter the month and year and displays the number of days in the month. For
//example, if the user entered month 2 and year 2012, the program should display
//that February 2012 has 29 days. If the user entered month 3 and year 2015, the
//program should display that March 2015 has 31 days.

import java.util.Scanner;
public class FindTheNumberOfDaysInAMonth {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the month
            System.out.print("Enter the month (1-12): ");
            int month = scanner.nextInt();

            // Prompt the user to enter the year
            System.out.print("Enter the year: ");
            int year = scanner.nextInt();

            // Check if it's a leap year
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            // Calculate the number of days in the month
            int numberOfDays;
            switch (month) {
                case 1: // January
                case 3: // March
                case 5: // May
                case 7: // July
                case 8: // August
                case 10: // October
                case 12: // December
                    numberOfDays = 31;
                    break;
                case 4: // April
                case 6: // June
                case 9: // September
                case 11: // November
                    numberOfDays = 30;
                    break;
                case 2: // February
                    numberOfDays = isLeapYear ? 29 : 28;
                    break;
                default:
                    numberOfDays = 0; // Invalid month
                    break;
            }

            if (numberOfDays > 0) {
                // Display the result
                String monthName;
                switch (month) {
                    case 1:
                        monthName = "January";
                        break;
                    case 2:
                        monthName = "February";
                        break;
                    case 3:
                        monthName = "March";
                        break;
                    case 4:
                        monthName = "April";
                        break;
                    case 5:
                        monthName = "May";
                        break;
                    case 6:
                        monthName = "June";
                        break;
                    case 7:
                        monthName = "July";
                        break;
                    case 8:
                        monthName = "August";
                        break;
                    case 9:
                        monthName = "September";
                        break;
                    case 10:
                        monthName = "October";
                        break;
                    case 11:
                        monthName = "November";
                        break;
                    case 12:
                        monthName = "December";
                        break;
                    default:
                        monthName = "Invalid month";
                        break;
                }

                System.out.println(monthName + " " + year + " has " + numberOfDays + " days.");
            } else {
                System.out.println("Invalid month or year.");
            }

            scanner.close();
        }
}

