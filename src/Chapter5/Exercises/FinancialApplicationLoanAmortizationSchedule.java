package Chapter5.Exercises;

import java.util.Scanner;

//5.22 (Financial application: loan amortization schedule) The monthly payment for a given
//loan pays the principal and the interest. The monthly interest is computed by multiplying the monthly interest rate and the balance (the remaining principal). The principal
//paid for the month is therefore the monthly payment minus the monthly interest. Write
//a program that lets the user enter the loan amount, number of years, and interest rate
//then displays the amortization schedule for the loan
public class FinancialApplicationLoanAmortizationSchedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.println("Number of Years: ");
        int years = input.nextInt();
        System.out.println("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = amount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
        double totalPayment = monthlyPayment * years * 12;

        double balance = amount;

   /*     double interest = monthlyInterestRate * balance;
        double principal = monthlyPayment - interest;
*//*        balance = balance - principal;*//*
*/
        System.out.println("Payment      Interest               Principal         Balance");
        for (int i = 1; i <= years * 12; i++) {
            double interest = monthlyInterestRate * balance;
           double principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + interest
                    + "\t\t" + principal + "\t\t" + balance);
        }




       /* System.out.println("Monthly payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
        System.out.println(interest);
        System.out.println(principal);
        System.out.println(balance);*/





















   /*     double tasaFinal = 8.0;

        for (annualInterestRate = 5.0; annualInterestRate <= tasaFinal; annualInterestRate = annualInterestRate + 0.125){
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = amount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;

            System.out.println("Interest Rate: " + annualInterestRate);
            System.out.println("Monthly payment: " + monthlyPayment);
            System.out.println("Total Payment: " + totalPayment);

        }*/



    }

}
