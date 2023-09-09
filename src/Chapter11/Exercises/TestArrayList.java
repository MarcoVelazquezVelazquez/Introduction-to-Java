package Chapter11.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

//11.4 (Maximum element in ArrayList) Write the following method that returns the
//maximum value in an ArrayList of integers. The method returns null if the
//list is null or the list size is 0.
//public static Integer max(ArrayList<Integer> list)
//Write a test program that prompts the user to enter a sequence of numbers ending
//with 0 and invokes this method to return the largest number in the input.
public class TestArrayList {

  /*  public static Integer max(ArrayList<Integer> list){

        return java.util.Collections.max(list);

    }*/

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0)
            return null;

        int result = list.get(0);
        for (int i = 1; i < list.size(); i++)
            if (result < list.get(i))
                result = list.get(i);

        return result;
    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter a sequence of numbers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt(); // Read a value from the input

            if (!list.contains(value) && value != 0)
                list.add(value); // Add the value if it is not in the list
        } while (value != 0);


        System.out.println("Max value: " + max(list));


    }
}
