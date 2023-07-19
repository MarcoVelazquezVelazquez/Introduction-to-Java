package Chapter4.Exercises;

import java.util.Scanner;

//4.14 (Convert letter grade to number) Write a program that prompts the user to enter
//a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3,
//2, 1, or 0. For other input, display invalid grade.
public class ConvertLetterGradeToNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");

        char letterGrade = input.next().charAt(0);

        switch (letterGrade){
            case 'a', 'A':
                System.out.println("The numeric value for grade " + letterGrade + " is 4");break;
            case 'b', 'B':
                System.out.println("The numeric value for grade " + letterGrade + " is 3");break;
            case 'c', 'C':
                System.out.println("The numeric value for grade " + letterGrade + " is 2");break;
            case 'd', 'D':
                System.out.println("The numeric value for grade " + letterGrade + " is 1");break;
            case 'e', 'E':
                System.out.println("The numeric value for grade " + letterGrade + " is 0");break;
            default:
                System.out.println("Invalid grade"); System.exit(1);
        }

    }
}


 /*   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char grade = input.nextLine().charAt(0);

        int value = 0;
        if (Character.toUpperCase(grade) == 'A')
            value = 4;
        else if (Character.toUpperCase(grade) == 'B')
            value = 3;
        else if (Character.toUpperCase(grade) == 'C')
            value = 2;
        else if (Character.toUpperCase(grade) == 'D')
            value = 1;
        else if (Character.toUpperCase(grade) == 'F')
            value = 0;
        else {
            System.out.println(grade + " is an invalid grade");
            System.exit(1);
        }

        System.out.println("The numeric value for grade " + grade
                + " is " + value);
    }
}*/