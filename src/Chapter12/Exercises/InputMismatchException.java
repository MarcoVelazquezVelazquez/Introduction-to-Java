package Chapter12.Exercises;

import java.util.Scanner;

//*12.2 (InputMismatchException) Write a program that prompts the user to read
//two integers and displays their sum. Your program should prompt the user to
//read the number again if the input is incorrect.
public class InputMismatchException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean finished = false;
        int number1 = 0;
        int number2 = 0;

        System.out.println("Enter two integers: ");

        while (!finished){

            try {
                number1 = input.nextInt();
                number2 = input.nextInt();
                finished = true;
            }
            catch (java.util.InputMismatchException ex){
                /*ex.printStackTrace();*/
                System.out.print("Incorrect input. Re-enter two integers: ");
                input.nextLine();//Discard input.
            }
        }
        System.out.println("Sum is " + (number1 + number2));
    }
}

