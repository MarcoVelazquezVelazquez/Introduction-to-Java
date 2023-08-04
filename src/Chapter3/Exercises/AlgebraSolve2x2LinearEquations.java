package Chapter3.Exercises;

import java.util.Scanner;
//3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
//Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
//the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
//that “The equation has no solution.”
public class AlgebraSolve2x2LinearEquations {
    // ax + by = e
    // cx + dy = f
    // x = ed - bf / ad - bc
    // y = af - ec / ad - bc

    // e = 3.4x + 50.2y = 44.5
    // f = 2.1x + .55y = 5.9

    // 3.4(a)x + 50.2(b)y = 44.5(e)
    // 2.1(c)x + .55(d)y = 5.9(f)

    // x = 44.5(e) * .55(d) - 50.2(b) * 5.9(f)
    // / 3.4(a) * .55(d) - 50.2(b) * 2.1(c)

    // y = 3.4(a) * 5.9(f) - 44.5(e) * 2.1(c)
    // / 3.4(a) * .55(d) - 50.2(b) * 2.1(c)

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e, f: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
        double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));

        double eFormula = ((a * x) + (b * y));
        double fFormula = ((c * x) + (d * y));

        if (((a * d) - (b * c)) == 0) {
            System.out.println("The equation has no solution.");
        } else {
            /*System.out.println("Primera Ecuación");
            System.out.println(eFormula);

            System.out.println("");

            System.out.println("Segunda Ecuación");
            System.out.println(fFormula);*/
            System.out.println(x);
            System.out.println(y);
        }

    }
}
