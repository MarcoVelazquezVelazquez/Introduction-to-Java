package Chapter5.Exercises;
//5.35 Summation
public class Summation {
    public static void main(String[] args) {
        double sum = 0;
        double squareRootNumber = 2;
        double squareRoot2 = Math.pow(2, 0.5);
        for (int i = 2, j = 1; i <= 625; i++, j++){
            sum = sum + 1.0 * 1 / ((Math.sqrt(j)) + (Math.pow( i, 0.5)));
        }
        System.out.println(sum);
    }
}
