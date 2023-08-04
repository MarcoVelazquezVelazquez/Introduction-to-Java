package Chapter3.Exercises;
//3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
//consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
//which is calculated from the other 9 digits using the following formula:
//(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
//d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
//If the checksum is 10, the last digit is denoted as X according to the ISBN-10
//convention. Write a program that prompts the user to enter the first 9 digits and
//displays the 10-digit ISBN (including leading zeros). Your program should read
//the input as an integer. Here are sample runs:
import java.util.Scanner;

public class BusinessCheckISBN_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of the ISBN: ");

        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();
        int d4 = input.nextInt();
        int d5 = input.nextInt();
        int d6 = input.nextInt();
        int d7 = input.nextInt();
        int d8 = input.nextInt();
        int d9 = input.nextInt();

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        if (d10 == 10){
            System.out.println("The ISBN-10 number is: " + d1 + "" + d2 + "" + d3+ "" + d4+ "" + d5 +
                    "" + d6+ "" + d7+ "" + d8 + "" + d9 + "" + "X");
        }else {
            System.out.println("The ISBN-10 number is: " + d1 + "" + d2 + "" + d3+ "" + d4+ "" + d5 +
                    "" + d6+ "" + d7+ "" + d8 + "" + d9 + "" + d10);
        }
    }
}
