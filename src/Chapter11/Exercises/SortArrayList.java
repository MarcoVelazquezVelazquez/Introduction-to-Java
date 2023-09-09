package Chapter11.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
       /* numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);*/

        System.out.println("Enter five numbers; ");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();

        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);
        numbers.add(n5);

        System.out.println("Original ArrayList: " + numbers);

        sort(numbers);

        System.out.println("Sorted ArrayList: " + numbers);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}