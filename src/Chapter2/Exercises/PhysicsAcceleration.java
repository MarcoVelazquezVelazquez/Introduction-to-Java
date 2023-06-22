package Chapter2.Exercises;

import java.util.Scanner;
// Exercise 2.9 (Physics: acceleration) Average acceleration is defined as the change of velocity
//divided by the time taken to make the change, as given by the following formula:
//a = v1 - v0
//t
//Write a program that prompts the user to enter the starting velocity v0 in meters/
//second, the ending velocity v1 in meters/second, and the time span t in seconds,
//then displays the average acceleration. Here is a sample run:
public class PhysicsAcceleration {
    public static void main(String[] args) {

        // a = (v0 - v1) / t

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Starting velocity (v0) in meters/second, " +
                "the Ending velocity (v1) in meters/second and the time span (t) in seconds: ");
        double startingVelocity = input.nextDouble();
        double endingVelocity = input.nextDouble();
        double time = input.nextDouble();

        double acceleration = (endingVelocity - startingVelocity) / time;

        System.out.println("The acceleration is: " + acceleration);
    }
}
