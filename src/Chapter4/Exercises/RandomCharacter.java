package Chapter4.Exercises;

import java.util.Scanner;
//4.16 (Random character) Write a program that displays a random uppercase letter
//using the Math.random() method.
public class RandomCharacter {
    public static void main(String[] args) {
        double random = (int) (Math.random() * 26 + 'A');

        char randomChar = (char) random;

        System.out.println(randomChar);


    }
}
