package Chapter5.Exercises;
//5.24 (Sum a series) Write a program to compute the following summation:
public class SumASeries {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 97; i = i + 2/*i+=2*/){
            /*sum += 1.0 * i / (i + 2);*/
            sum = sum + 1.0 * i / (i + 2);
        }
        System.out.println("The sum of the series is: " + sum);
    }
}
