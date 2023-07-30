package Chapter5.Exercises;

import java.util.Scanner;

public class StatisticsComputeMeanAndStandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");

        int count = 0;
        int number = 0;

        for (count = 0; count < 10; count++){
            number = input.nextInt();
        }
        System.out.println(number);


    }


}
