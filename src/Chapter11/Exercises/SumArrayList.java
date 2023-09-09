package Chapter11.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
       /* numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);*/

        System.out.println("Enter five numbers; ");

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        double n5 = input.nextDouble();

        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);
        numbers.add(n5);

        System.out.println("ArrayList: " + numbers);

        //sum(numbers);


        System.out.println("Sum: " + sum(numbers));
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        return sum;
    }
}