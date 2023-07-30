package Chapter5.Exercises;
//5.21 (Financial application: compare loans with various interest rates) Write a program that lets the user enter the loan amount and loan period in number of years,
//and displays the monthly and total payments for each interest rate starting from
//5% to 8%, with an increment of 1/8.

import java.util.Scanner;

//Math.pow(1 + monthlyInterestRate, numberOfYears * 12).
public class FinancialApplicationCompareLoansWithVariousInterestRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.println("Number of Years: ");
        int years = input.nextInt();

        double annualInterestRate = 5.0;
        double tasaFinal = 8.0;


        for (annualInterestRate = 5.0; annualInterestRate <= tasaFinal; annualInterestRate = annualInterestRate + 0.125){
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = amount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;

            System.out.println("Interest Rate: " + annualInterestRate);
            System.out.println("Monthly payment: " + monthlyPayment);
            System.out.println("Total Payment: " + totalPayment);

        }



    }

}
