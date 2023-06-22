package Chapter2.Exercises;

import java.util.Scanner;

//Exercise 2.2 (Compute the volume of a cylinder) Write a program that reads in the radius
//and length of a cylinder and computes the area and volume using the following
//formulas:
//area = radius * radius * π
//volume = area * length
public class ComputeTheVolumeOfACylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.println("Enter the radius of the Cylinder");
        double radius = input.nextDouble();

        System.out.println("Enter the length of the Cylinder");
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area of the Cylinder is " + area);
        System.out.println("The volume of the Cylinder is " + volume);

    }

}
