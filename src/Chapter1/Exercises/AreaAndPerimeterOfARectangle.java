package Chapter1.Exercises;
//Exercise 1.9(Area and perimeter of a rectangle) Write a program that displays the area and
//perimeter of a rectangle with a width of 4.5 and a height of 7.9 using the following formula:
//area = width * height
public class AreaAndPerimeterOfARectangle {
    public static void main(String[] args) {
        System.out.println("The Area is " + (4.5 * 7.9));

        //Con variables
        double width = 4.5;
        double height = 7.9;
        double area = width * height;

        System.out.println("The Area of a rectangle is " + area);

    }
}
