package Chapter4.Exercises;

import java.util.Scanner;

//4.12 (Hex to binary) Write a program that prompts the user to enter a hex digit and
//displays its corresponding binary number in four digits. For example, hex digit 7
//is 0111 in binary. Hex digits can be entered either in uppercase or lowercase. For
//an incorrect input, display invalid input. Here is a sample run:

public class HexToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Hex digit");
        char hex = input.nextLine().charAt(0);

        switch (hex){
            case '0' :
                System.out.println("The binary values is 0000"); break;
            case '1' :
                System.out.println("The binary values is 0001"); break;
            case '2' :
                System.out.println("The binary values is 0010"); break;
            case '3' :
                System.out.println("The binary values is 0011"); break;
            case '4' :
                System.out.println("The binary values is 0100"); break;
            case '5' :
                System.out.println("The binary values is 0101"); break;
            case '6' :
                System.out.println("The binary values is 0110"); break;
            case '7' :
                System.out.println("The binary values is 0111"); break;
            case '8' :
                System.out.println("The binary values is 1000"); break;
            case '9' :
                System.out.println("The binary values is 1001"); break;
            case 'A', 'a' :
                System.out.println("The binary values is 1010"); break;
            case 'B', 'b' :
                System.out.println("The binary values is 1011"); break;
            case 'C', 'c' :
                System.out.println("The binary values is 1100"); break;
            case 'D', 'd' :
                System.out.println("The binary values is 1101"); break;
            case 'E', 'e' :
                System.out.println("The binary values is 1110"); break;
            case 'F', 'f':
                System.out.println("The binary values is 1111"); break;
            default:
                System.out.println("Invalid input"); System.exit(1);
        }
    }
}


