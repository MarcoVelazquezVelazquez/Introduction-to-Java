package Chapter4.Exercises;
// *4.5 (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
//in which all sides are of the same length and all angles have the same degree (i.e.,
//the polygon is both equilateral and equiangular). The formula for computing the
//area of a regular polygon is
//Area = n * s
//2
//4 * tan(
//p
//n )

import java.util.Scanner;

//Here, s is the length of a side. Write a program that prompts the user to enter the
//number of sides and their length of a regular polygon and displays its area
public class GeometryAreaOfARegularPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");

        double numberOfSides = input.nextDouble();

        System.out.println("Enter the side: ");

        double side = input.nextDouble();

        double area = (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.println("The area of the polygon is: " + area);
    }
}
