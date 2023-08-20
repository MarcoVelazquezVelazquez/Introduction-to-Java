package Chapter9.Exercises;

import java.util.Scanner;

//*9.11 (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
//2 * 2 system of linear equations:
//ax + by = e/cx + dy = f
//x = ed - bf
//ad - bc
//y = af - ec
//ad - bc
// The class contains:
//Private data fields a, b, c, d, e, and f.
//■ A constructor with the arguments for a, b, c, d, e, and f.
//■ Six getter methods for a, b, c, d, e, and f.
//■ A method named isSolvable() that returns true if ad - bc is not 0.
//■ Methods getX() and getY() that return the solution for the equation.
// Draw the UML diagram for the class then implement the class. Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result.
//If ad - bc is 0, report that “The equation has no solution.” See Programming
//Exercise 3.3 for sample runs.
public class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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
    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable(){
        if (((a * d) - (b * c)) != 0){
            return true;
        }
        else {
            return false;
        }
    }

    public double getX(){
        return  (((e * d) - (b * f)) / ((a * d) - (b * c)));
    }

    public double getY(){
        return (((a * f) - (e * c)) / ((a * d) - (b * c)));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e, f: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);

        System.out.println("Equation: ");

        if (linearEquation.isSolvable() == false){
            System.out.println("The equation has no solution");
        }
        else {
            System.out.println("First equation (X): " + linearEquation.getX());
            System.out.println("Second equation (Y): " + linearEquation.getY());
        }
    }
}
