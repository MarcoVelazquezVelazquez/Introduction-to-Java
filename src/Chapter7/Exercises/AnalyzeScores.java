package Chapter7.Exercises;

import java.util.Scanner;

//7.4 (Analyze scores) Write a program that reads an unspecified number of scores and
//determines how many scores are above or equal to the average, and how many
//scores are below the average. Enter a negative number to signify the end of the
//input. Assume the maximum number of scores is 100.
public class AnalyzeScores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] scores = new int[100];

        int count = 0;
        int sum = 0;
        int numberOfScores;

        do {
            System.out.println("Enter scores: ");
            numberOfScores = input.nextInt();
            if (numberOfScores >= 0) {
                scores[count] = numberOfScores;
                sum = sum + numberOfScores;
                count++;
            }
        } while (numberOfScores >= 0);

        System.out.println("The count is: " + count);
        int average = sum / count;

        int aboveAverage = 0;
        int equalAverage = 0;
        int belowAverage = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] > average) {
                aboveAverage++;
            } else if (scores[i] == average) {
                equalAverage++;
            } else if (scores[i] < average) {
                belowAverage++;
            }
        }
        System.out.println("The number of scores above the average are: " + aboveAverage);
        System.out.println("The number of scores equal to average are: " + equalAverage);
        System.out.println("The number of scores below average are: " + belowAverage);
    }
}
