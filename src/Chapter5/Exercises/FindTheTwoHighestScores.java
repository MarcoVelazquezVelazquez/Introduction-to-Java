package Chapter5.Exercises;

import java.util.Scanner;

//5.9 (Find the two highest scores) Write a program that prompts the user to enter the
//number of students and each student’s name and score, and finally displays the
//student with the highest score and the student with the second-highest score. Use
//the next() method in the Scanner class to read a name rather than using the
//nextLine() method. Assume that the number of students is at least 2.
public class FindTheTwoHighestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int numberofStudents = input.nextInt();


        String alumnoConMayorPuntuacion = "";
        int mayorPuntuacion = 10;
        String alumnoConSegundaPuntuacion = "";
        int segundaPuntuacion = 9;


        for (int i = 0; i < numberofStudents; i++) {

            System.out.println("Enter the name of the Student: ");
            String student = input.next();
            System.out.println("Enter the Score of the Student: ");
            int score = input.nextInt();

            if (score <= mayorPuntuacion){
                alumnoConMayorPuntuacion = student;
                mayorPuntuacion = score;
            /*    alumnoConSegundaPuntuacion = alumnoConMayorPuntuacion;
                segundaPuntuacion = mayorPuntuacion;
                alumnoConMayorPuntuacion = student;
                mayorPuntuacion = score;
*/
            } else if (score <= segundaPuntuacion) {
                alumnoConSegundaPuntuacion = student;
                segundaPuntuacion = score;

            }
        }
        System.out.println("The student with the highest score is " + alumnoConMayorPuntuacion + " with a score of " + mayorPuntuacion);
        if (numberofStudents > 1){
            System.out.println("The student with the second highest score is " + alumnoConSegundaPuntuacion + " with a score of " + segundaPuntuacion);
        }

        }

    }
