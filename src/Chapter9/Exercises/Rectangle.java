package Chapter9.Exercises;
//9.1 (The Rectangle class) Following the example of the Circle class in Section 9.2,
//design a class named Rectangle to represent a rectangle. The class contains:
//■ Two double data fields named width and height that specify the width and
//height of the rectangle. The default values are 1 for both width and height.
//■ A no-arg constructor that creates a default rectangle.
//■ A constructor that creates a rectangle with the specified width and height.
//■ A method named getArea() that returns the area of this rectangle.
//■ A method named getPerimeter() that returns the perimeter.
// Draw the UML diagram for the class then implement the class. Write a test program that creates
// two Rectangle objects—one with width 4 and height 40, and the other with width 3.5 and height 35.9. Display the width, height, area, and
//perimeter of each rectangle in this order.
//Draw the UML diagram for the class then implement the class. Write a test program that creates two Rectangle
// objects—one with width 4 and height 40, and the other with width 3.5 and height 35.9. Display the width, height, area, and
//perimeter of each rectangle in this order.
public class Rectangle {
    //Two double data fields named width and height that specify the width and
    //height of the rectangle. The default values are 1 for both width and height.
    double width = 1;
    double height = 1;

    //A no-arg constructor that creates a default rectangle.
    public Rectangle() {

    }
    //A constructor that creates a rectangle with the specified width and height.
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //A method named getArea() that returns the area of this rectangle.
    double getArea(){
        double area = width * height;
        return area;
    }

    //A method named getPerimeter() that returns the perimeter.

    double getPerimeter(){
        double perimeter = (width * 2) + (height * 2);
        return perimeter;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("The first rectangle has: " + "Width " + rectangle1.width + " " + "Height: " + rectangle1.height + " " + "Area: " + rectangle1.getArea() + " " + "Perimeter: " + rectangle1.getPerimeter());
        System.out.println("The second rectangle has: " + "Width " + rectangle2.width + " " + "Height: " + rectangle2.height + " " + "Area: " + rectangle2.getArea() + " " + "Perimeter: " + rectangle2.getPerimeter());
    }
}
