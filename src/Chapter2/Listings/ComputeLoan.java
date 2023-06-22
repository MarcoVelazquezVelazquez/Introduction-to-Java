package Chapter2.Listings;

//Listing 2.9 ComputeLoan

//Stage 3: System Design
//During system design, you identify the steps in the program.
//Step 3.1. Prompt the user to enter the annual interest rate, the number of years, and the loan
//amount.
//(The interest rate is commonly expressed as a percentage of the principal for a period of
//one year. This is known as the annual interest rate.)Step 3.2. The input for the annual interest rate is a number in percent format, such as 4.5%.
//The program needs to convert it into a decimal by dividing it by 100. To obtain
//the monthly interest rate from the annual interest rate, divide it by 12, since a year
//has 12 months. Thus, to obtain the monthly interest rate in decimal format, you
//need to divide the annual interest rate in percentage by 1200. For example, if the
//annual interest rate is 4.5%, then the monthly interest rate is 4.5/1200 = 0.00375.
//Step 3.3. Compute the monthly payment using the preceding formula.
//Step 3.4. Compute the total payment, which is the monthly payment multiplied by 12 and
//multiplied by the number of years.
//Step 3.5. Display the monthly payment and total payment.

//Stage 4: Implementation
//Implementation is also known as coding (writing the code). In the formula, you have to compute (1 + monthlyInterestRate)numberOf Years*12, which can be obtained using Math.
//pow(1 + monthlyInterestRate, numberOfYears * 12).
//Listing 2.9 gives the complete program.


import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Enter annual interest rate in percentage, e.g., 7.25
        System.out.print("Enter annual interest rate, e.g., 7.25: ");
        double annualInterestRate = input.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Enter number of years
        System.out.print(
                "Enter number of years as an integer, e.g., 5: ");
        int numberOfYears = input.nextInt();

        // Enter loan amount
        System.out.print("Enter loan amount, e.g., 120000.95: ");
        double loanAmount = input.nextDouble();

        // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Display results
        System.out.println("The monthly payment is $" +
                (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" +
                (int) (totalPayment * 100) / 100.0);
    }
}
