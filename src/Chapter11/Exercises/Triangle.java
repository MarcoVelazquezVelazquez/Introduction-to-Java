package Chapter11.Exercises;
//(The Triangle class) Design a class named Triangle that extends
//GeometricObject. The class contains:
//■ Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of a triangle.
//■ A no-arg constructor that creates a default triangle.
//■ A constructor that creates a triangle with the specified side1, side2, and side3.
//■ The accessor methods for all three data fields.
//■ A method named getArea() that returns the area of this triangle.
//■ A method named getPerimeter() that returns the perimeter of this triangle.
//■ A method named toString() that returns a string description for the triangle.
//For the formula to compute the area of a triangle, see Programming Exercise 2.19.
//The toString() method is implemented as follows:
//return "Triangle: side1 = " + side1 + " side2 = " + side2 +
// " side3 = " + side3;
//Draw the UML diagrams for the classes Triangle and GeometricObject and
//implement the classes. Write a test program that prompts the user to enter three
//sides of the triangle, a color, and a Boolean value to indicate whether the triangle
//is filled. The program should create a Triangle object with these sides and set
//the color and filled properties using the input. The program should display
//the area, perimeter, color, and true or false to indicate whether it is filled or not.
import Chapter11.Listings.GeometricObject;

import java.util.Scanner;

public class Triangle extends GeometricObject {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter the color of the triangle");
        String color = input.next();

     /*   System.out.println("Is the triangle filled? Yes/No");

        String answer = input.next();

        boolean filled = false;

        if (answer.contains("Yes")){
            filled = true;
        }
        else {
            filled = false;
        }*/

        System.out.println("Is the triangle filled? Yes/No");

        boolean filled = input.hasNextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println("Object: " + triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());

        System.out.println(triangle);
    }
}
