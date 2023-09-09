package Chapter9.Exercises;

import java.util.Arrays;
import java.util.Scanner;

//**9.13 (The Location class) Design a class named Location for locating a maximal
//value and its location in a two-dimensional array. The class contains public data
//fields row, column, and maxValue that store the maximal value and its indices in
//a two-dimensional array with row and column as int types and maxValue as a
//double type.
// Write the following method that returns the location of the largest element in a
//two-dimensional array:
//public static Location locateLargest(double[][] a)
// The return value is an instance of Location. Write a test program that prompts
//the user to enter a two-dimensional array and displays the location of the largest
//element in the array.
public class Location {

    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] array){
        int maxRow = 0;
        int maxColumn = 0;
        double maxValue = array[maxRow][maxColumn];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        return new Location(maxRow, maxColumn, maxValue);
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        double [][] array = new double [row][column];

        System.out.println("Enter the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        Location location = Location.locateLargest(array);

        System.out.println(Arrays.deepToString(array));

        System.out.println("The location of the largest element is: " + location.maxValue + " at " + "(" + location.row + ", " + location.column + ")");
    }
}