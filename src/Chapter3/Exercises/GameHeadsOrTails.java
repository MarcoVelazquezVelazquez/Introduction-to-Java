package Chapter3.Exercises;

import java.util.Scanner;

public class GameHeadsOrTails {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double randomNumber = (int) Math.random();

        if (randomNumber == 1){
            String head = "Head";
        }
        else {
            String tails = "Tail";
        }

        System.out.println("Guess th flip of a coin (0 is head, 1 is tail): ");
        int guess = input.nextInt();

        if (guess == randomNumber){
            System.out.println("You´re correct ");
        }




    }
}
