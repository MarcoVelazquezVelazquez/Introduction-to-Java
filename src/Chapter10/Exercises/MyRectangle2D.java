package Chapter10.Exercises;

public class MyRectangle2D {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double width;

    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width * 2) + (height * 2);
    }

    public boolean contains(double x, double y) {
        double minX = this.x - width / 2;
        double maxX = this.x + width / 2;
        double minY = this.y - height / 2;
        double maxY = this.y + height / 2;
        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }

    public boolean contains(MyRectangle2D r) {
        double minX = this.x - width / 2;
        double maxX = this.x + width / 2;
        double minY = this.y - height / 2;
        double maxY = this.y + height / 2;

        double rMinX = r.x - r.width / 2;
        double rMaxX = r.x + r.width / 2;
        double rMinY = r.y - r.height / 2;
        double rMaxY = r.y + r.height / 2;

        return minX <= rMinX && maxX >= rMaxX && minY <= rMinY && maxY >= rMaxY;
    }

    public boolean overlaps(MyRectangle2D r) {
        double minX = this.x - width / 2;
        double maxX = this.x + width / 2;
        double minY = this.y - height / 2;
        double maxY = this.y + height / 2;

        double rMinX = r.x - r.width / 2;
        double rMaxX = r.x + r.width / 2;
        double rMinY = r.y - r.height / 2;
        double rMaxY = r.y + r.height / 2;

        return maxX > rMinX && minX < rMaxX && maxY > rMinY && minY < rMaxY;
    }

    public static void main(String[] args) {

        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);

        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Contains 1: " + r1.contains(3,3));
        //System.out.println("Contains 2: " + r1.contains(new MyRectangle2D(4,5,10.5,3.2));
       // System.out.println("overlaps: " + r1.overlaps(3,5,2.3,5.4));



    }

}
