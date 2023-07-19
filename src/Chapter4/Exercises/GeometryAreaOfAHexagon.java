package Chapter4.Exercises;

import java.util.Scanner;

// 4.4 (Geometry: area of a hexagon) The area of a hexagon can be computed using the
//following formula (s is the length of a side):
//Area = 6 * s
//2
//4 * tan(
//p
//6
//)
//Write a program that prompts the user to enter the side of a hexagon and displays
//its area.
public class GeometryAreaOfAHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");

        double side = input.nextDouble();


        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

        String numeroRedondeado = String.format("%.2f", area);

        System.out.println("The area of the hexagon is: " + numeroRedondeado);
    }

}
