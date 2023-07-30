package Chapter5.Exercises;

import java.util.Scanner;

//5.8 (Find the highest score) Write a program that prompts the user to enter the number of students and each student’s name and score, and finally displays the name
//of the student with the highest score. Use the next() method in the Scanner
//class to read a name, rather than using the nextLine() method. Assume that the
//number of students is at least 1.
public class FindTheHighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter the name of the Student: ");
        String nameOfStudent = input.next();
        System.out.println("Enter the Score of the Student");
        int score = input.nextInt();

        while (count != numberOfStudents){
            System.out.println("Enter the name of the Student: ");
            String nameOfStudent1 = input.next();
            System.out.println("Enter the Score of the Student");
            int score1 = input.nextInt();
            count++;

            if (score < score1){
                 nameOfStudent = nameOfStudent1;
                 score = score1;
            }
            System.out.println("Tha Student with the highest score is " + nameOfStudent + "" +
                    " " + " with a score of " + score);
        }
    }
}

/*
//SOLUCIÓN DEL LIBRO
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print(
                "Enter the number of students: ");
        int numOfStudents = input.nextInt();

        System.out.print(
                "Enter a student name: ");
        String student1 = input.next();
        System.out.print(
                "Enter a student score: ");
        double score1 = input.nextDouble();

        for (int i = 0; i < numOfStudents - 1; i++) {
            System.out.print(
                    "Enter a student name: ");
            String student = input.next();

            System.out.print(
                    "Enter a student score: ");
            double score = input.nextDouble();

            if (score > score1) {
                student1 = student;
                score1 = score;
            }
        }

        System.out.println("Top student " +
                student1 + "'s score is " + score1);
    }
}

*/
