package Chapter2.Exercises;
//Exercise 2.6 (Sum the digits in an integer) Write a program that reads an integer between 0
//and 1000 and adds all the digits in the integer. For example, if an integer is 932,
//the sum of all its digits is 14.
//Hint: Use the % operator to extract digits, and use the / operator to remove the
//extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93
import java.util.Scanner;


public class SumTheDigitsInAnInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        int extractDigits = number % 10;
        int removeDigits = number / 10;
        int extractDigits2 = removeDigits % 10;
        removeDigits = removeDigits / 10;
        int extractDigits3 = removeDigits % 10;

        int sum = extractDigits + extractDigits2 + extractDigits3;

        System.out.println("The sum of the digits in the integer is: " + sum);


    }

}
