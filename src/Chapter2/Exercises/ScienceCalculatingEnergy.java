package Chapter2.Exercises;
// Exercise 2.10 (Science: calculating energy) Write a program that calculates the energy needed
//to heat water from an initial temperature to a final temperature. Your program
//should prompt the user to enter the amount of water in kilograms and the initial
//and final temperatures of the water. The formula to compute the energy is
//Q = M * (finalTemperature – initialTemperature) * 4184
//where M is the weight of water in kilograms, initial and final temperatures are in
//degrees Celsius, and energy Q is measured in joules.
import java.util.Scanner;

public class ScienceCalculatingEnergy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        double amountOfWater = input.nextDouble();

        System.out.println("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.println("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        // Q = M * (finalTemperature – initialTemperature) * 4184
        double energy = amountOfWater * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is: " + energy);
    }
}
