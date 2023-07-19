package Chapter4.Exercises;

import java.util.Map;
import java.util.Scanner;

// 4.1 (Geometry: area of a pentagon) Write a program that prompts the user to enter
//the length from the center of a pentagon to a vertex and computes the area of the
//pentagon, as shown in the following figure.
//The formula for computing the area of a pentagon is Area = 5 * s
//2
//4 * tan a
//p
//5 b
//, where
//s is the length of a side. The side can be computed using the formula s = 2r sin
//p
//5
//,
//where r is the length from the center of a pentagon to a vertex. Round up two digits
//after the decimal point.
public class GeometryAreaOfAPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");
        double lengthCenter = input.nextDouble();

        double lengthSide = (2 * lengthCenter) * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(lengthSide, 2)) / (4 * Math.tan(Math.PI / 5));


        String numeroRedondeado = String.format("%.2f", area);
        System.out.println("The area of the pentagon is: " + numeroRedondeado);
    }
}
