package Chapter10.Exercises;
//NO TERMINADO
public class Triangle2D extends MyPoint {

    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;


    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }
    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
    public Triangle2D(){
        p1 = new MyPoint();
        p2 = new MyPoint();
        p3 = new MyPoint();

        p1.setX(0);
        p1.setY(0);

        p2.setX(0);
        p2.setY(0);

        p3.setX(0);
        p3.setY(0);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }


    /* Area
       Scanner input = new Scanner(System.in);

        System.out.println("Enter the coordinates of three points separated by spaces " +
                "like x1 y1 x2 y2 x3 y3: ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = (x1) + (y1);
        double side2 = (x2) + (y2);
        double side3 = (x3) + (y3);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);

        System.out.println("The area of the triangle is: " + area);
     */

   /* public double getArea(MyPoint point x1, MyPoint point){
        return
    }*/
}
