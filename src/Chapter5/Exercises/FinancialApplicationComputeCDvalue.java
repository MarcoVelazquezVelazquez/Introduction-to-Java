package Chapter5.Exercises;

import java.util.Scanner;

//5.31 (Financial application: compute CD value) Suppose you put $10,000 into a CD
//with an annual percentage yield of 5.75%. After one month, the CD is worth
//10000 + 10000 * 5.75 / 1200 = 10047.92
// After two months, the CD is worth
//10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
// After three months, the CD is worth
//10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
// and so on.
//Write a program that prompts the user to enter an amount (e.g., 10000), the
//annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and
//displays a table as presented in the sample run.
public class FinancialApplicationComputeCDvalue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the initial deposit amount: ");
        double initialDepositAmount = input.nextDouble();
        System.out.println("Enter annual percentage yield: ");
        double annualPercentageYield = input.nextDouble();
        System.out.println("Enter maturity period (number of months): ");
        int month = input.nextInt();

        double cDValue = initialDepositAmount + initialDepositAmount * annualPercentageYield / 1200;
        double cd = initialDepositAmount * annualPercentageYield / 1200;


        for (int i = 1; i <= month; i++){
            initialDepositAmount = initialDepositAmount + cd;
            System.out.println("Month " + i);
            System.out.println("CD Value " + initialDepositAmount);
        }
    }
}
