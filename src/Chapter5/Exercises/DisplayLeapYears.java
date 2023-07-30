package Chapter5.Exercises;

//*5.27 (Display leap years) Write a program that displays all the leap years, 10 per line,
//from 101 to 2100, separated by exactly one space. Also display the number of
//leap years in this period.
public class DisplayLeapYears {
    public static void main(String[] args) {
        int numberOfLeapYears = 0;
        for (int year = 101; year <= 2100; year++) {

            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                System.out.println(year);
                numberOfLeapYears++;
         /*       if (numberOfLeapYears % 10 == 0){
                    System.out.println("\t\t");
                }*/
            }
        }
        System.out.println("The number of leap years in that period is: " + numberOfLeapYears);
    }
}
