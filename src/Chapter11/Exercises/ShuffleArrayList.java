package Chapter11.Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {

    public static void main(String[] args) {
        // Example usage:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);

        shuffle(numbers);

        System.out.println("Shuffled ArrayList: " + numbers);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}