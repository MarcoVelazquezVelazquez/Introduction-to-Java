package Chapter5.Exercises;

import java.util.Scanner;

//5.30 (Financial application: compound value) Suppose you save $100 each month
//into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05 / 12 = 0.00417.
// After the first month, the value in the account becomes
//100 * (1 + 0.00417) = 100.417
// After the second month, the value in the account becomes
//(100 + 100.417) * (1 + 0.00417) = 201.252
// After the third month, the value in the account becomes
//(100 + 201.252) * (1 + 0.00417) = 302.507
// and so on.
//Write a program that prompts the user to enter an amount (e.g., 100),
// the annual interest rate (e.g., 5), and the number of months (e.g., 6) then displays the
//amount in the savings account after the given month.
public class FinancialApplicationCompoundValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount: ");
        double amount = input.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        double interestRate = input.nextDouble();
        System.out.println("Enter the number of months: ");
        int months = input.nextInt();

        double monthlyInterestRate = (interestRate * 0.01) / 12;


        double savingsAccount = (amount) * (1 + monthlyInterestRate);
        double monthlyYields = (1 + monthlyInterestRate);


        for (int i = 1; i < months; i++){
            savingsAccount = (amount + savingsAccount) * monthlyYields;
        }

        System.out.println("The amount after " + months + " month(s) is " + savingsAccount);
    }
}
