package Chapter7.Exercises;

import java.util.Scanner;

//*7.1 (Assign grades) Write a program that reads student scores, gets the best score, and
//then assigns grades based on the following scheme:
//Grade is A if score is >= best -10;
//Grade is B if score is >= best -20;
//Grade is C if score is >= best -30;
//Grade is D if score is >= best -40;
//Grade is F otherwise.
// The program prompts the user to enter the total number of students, then prompts
//the user to enter all of the scores, and concludes by displaying the grades.

public class AssignGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter scores: ");
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }

        int bestScores = bestScore(scores);
        for (int i = 0; i < numberOfStudents; i++) {
            char grade = grades(scores[i], bestScores);
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }
    public static char grades(int scores, int best) {
        int difference = best - scores;
        if (difference <= 10) {
            return 'A';
        } else if (difference <= 20) {
            return 'B';
        } else if (difference <= 30) {
            return 'C';
        } else if (difference <= 10) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static int bestScore(int[] scores){
        int best = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        return best;
    }
}
