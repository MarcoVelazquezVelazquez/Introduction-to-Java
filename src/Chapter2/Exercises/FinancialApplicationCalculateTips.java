package Chapter2.Exercises;

import java.util.Scanner;

//Exercise 2.5 (Financial application: calculate tips) Write a program that reads the subtotal
//and the gratuity rate, then computes the gratuity and total. For example, if the
//user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
//as gratuity and $11.5 as total.
public class FinancialApplicationCalculateTips {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");

        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is " + gratuity + " and the Total is " + total);

    }


}
