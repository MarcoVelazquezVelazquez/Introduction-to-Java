package Chapter10.Exercises;

public class MyPoint {
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

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint specifiedPoint){
        double distanceX = this.x - specifiedPoint.x;
        double distanceY = this.y - specifiedPoint.y;
        return Math.sqrt((distanceX * distanceX) + (distanceY * distanceY));
    }

    public double distance(int x, int y){
        double distanceX = this.x - x;
        double distanceY = this.y - y;
        return Math.sqrt((distanceX * distanceX) + (distanceY * distanceY));
    }


    public static double distance(MyPoint point1, MyPoint point2){
        double distanceX = point1.x- point2.x;
        double distanceY = point1.y - point2.y;
        return Math.sqrt((distanceX * distanceX) + (distanceY * distanceY));
    }

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10 , 30.5);


        System.out.println("Point 1 " + p1.getX() + ", " + p1.getY());
        System.out.println("Point 2 " + p2.getX() + ", " + p2.getY());

        System.out.println("Distance between Point 1 and Point 2 is: " + p1.distance(p2));
        System.out.println("Static distance between Point 1 and Point 2 is: " + MyPoint.distance(p1, p2));



    }

}
