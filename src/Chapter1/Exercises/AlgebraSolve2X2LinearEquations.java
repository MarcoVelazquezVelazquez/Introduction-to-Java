package Chapter1.Exercises;
//Exercise 1.6 Approximate PI p can be computed using the following formula:
// Write a program that solves the following equation and displays the value for x and
//y: (Hint: replace the symbols in the formula with numbers to compute x and y. This
//exercise can be done in Chapter 1 without using materials in later chapters.)
//3.4x + 50.2y = 44.5
//2.1x + .55y = 5.9

public class AlgebraSolve2X2LinearEquations {

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

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;

        double x = (((e*d) - (b*f)) / ((a*d) - (b*c)));
        double y = (((a*f) - (e*c)) / ((a*d) - (b*c)));

        double eFormula = ((a * x) + (b * y));
        double fFormula = ((c * x) + (d * y));

        System.out.println("Primera Ecuación");
        System.out.println(eFormula);

        System.out.println("");

        System.out.println("Segunda Ecuación");
        System.out.println(fFormula);


    }

}
