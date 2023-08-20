package Chapter7.Exercises;

import java.util.Scanner;

//7.14 (Compute gcd) Write a method that returns the gcd of an unspecified number of
//integers. The method header is specified as follows:
//public static int gcd(int... numbers)
// Write a test program that prompts the user to enter five numbers, invokes the
//method to find the gcd of these numbers, and displays the gcd.
public class ComputeGCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayNumbers = new int[5];

        System.out.println("Enter five numbers: ");

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = input.nextInt();
        }

        System.out.println("The GCD is: " + gcd(arrayNumbers));
    }

    public static int gcd(int... numbers) {
        int g = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            g = gcd(g, numbers[i]);

        return g;
    }

    /*** Return the gcd of two integers*/
    public static int gcd(int n1, int n2) {
        int gcd = 1; // Initial gcd is 1
        int k = 2;   // Possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++;
        }

        return gcd; // Return gcd
    }
}