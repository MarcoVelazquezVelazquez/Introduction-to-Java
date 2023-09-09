package Chapter9.Exercises;

import java.util.Scanner;

//*9.10 (Algebra: quadratic equations) Design a class named QuadraticEquation for
//a quadratic equation ax2 + bx + c = 0. The class contains:
//■ Private data fields a, b, and c that represent three coefficients.
//■ A constructor with the arguments for a, b, and c.
//■ Three getter methods for a, b, and c.
//■ A method named getDiscriminant() that returns the discriminant, which
//is b2 - 4ac.
//■ The methods named getRoot1() and getRoot2() for returning two roots
//of the equation
//r1 = -b + 2b2 - 4ac
//2a
//and r2 = -b - 2b2 - 4ac
//2a
//These methods are useful only if the discriminant is nonnegative. Let these methods
//return 0 if the discriminant is negative.
// Draw the UML diagram for the class then implement the class. Write a test program that prompts the user to enter values for a, b, and c and displays the result
//based on the discriminant. If the discriminant is positive, display the two roots. If
//the discriminant is 0, display the one root. Otherwise, display “The equation has
//no roots.” See Programming Exercise 3.1 for sample runs
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    double getRoot1() {
        if (getDiscriminant() < 0)
            return 0;
        else {
            return (-b + getDiscriminant()) / (2 * a);
        }
    }

    double getRoot2() {
        if (getDiscriminant() < 0)
            return 0;
        else {
            return (-b - getDiscriminant()) / (2 * a);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.println("Enter the value of c: ");
        double c = input.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        double discriminant = qe.getDiscriminant();

        if (discriminant > 0){
            System.out.println("The equation has two roots: ");
            System.out.println("Root 1 " + qe.getRoot1());
            System.out.println("Root 2 " + qe.getRoot2());
        }
        else if (discriminant == 0){
            System.out.println("The equation has one root: ");
            System.out.println("Root " + qe.getRoot1());
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}


