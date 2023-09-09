package Chapter9.Exercises;
//**9.9 (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have
//the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). Design a class named RegularPolygon that contains:
//■ A private int data field named n that defines the number of sides in the polygon
//with default value 3.
//■ A private double data field named side that stores the length of the side with
//default value 1.
//■ A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
//■ A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
//■ A no-arg constructor that creates a regular polygon with default values.
//■ A constructor that creates a regular polygon with the specified number of sides
//and length of side, centered at (0, 0).
//■ A constructor that creates a regular polygon with the specified number of sides,
//length of side, and x- and y-coordinates.
//■ The accessor and mutator methods for all data fields.
//■ The method getPerimeter() that returns the perimeter of the polygon.
//■ The method getArea() that returns the area of the polygon. The formula for
//computing the area of a regular polygon is
//Area = n * s2 / 4 * tan (pi/n)

public class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
    }
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double  getPerimeter(){
        return n * side;
    }

    public double  getArea(){
        double area = (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI/n));
        return area;
    }

    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6,4);
        RegularPolygon rp3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("First Polygon: " + "Perimeter: " + rp1.getPerimeter() + " Area: " + rp1.getArea());
        System.out.println("First Polygon: " + "Perimeter: " + rp2.getPerimeter() + " Area: " + rp2.getArea());
        System.out.println("First Polygon: " + "Perimeter: " + rp3.getPerimeter() + " Area: " + rp3.getArea());
    }

}
