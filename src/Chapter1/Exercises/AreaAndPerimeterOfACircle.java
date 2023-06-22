package Chapter1.Exercises;
//Exercise 1.8 (Area and perimeter of a circle) Write a program that displays the area and
// perimeter of a circle that has a radius of 5.5 using the following formula
public class AreaAndPerimeterOfACircle {
    public static void main(String[] args) {
        // Perimeter = 2 x radius x PI
        // Area = radius x radius x PI
        System.out.println((2 * 5.5) * (3.1416));
        System.out.println((5.5 * 5.5) * (3.1416));


        //Con Variables
        double PI = 3.1416;
        double radius = 5.5;
        double perimeter = (2 * radius) * (PI);
        double Area = (radius * radius) * (PI);

        System.out.println(perimeter);
        System.out.println(Area);
    }
}
