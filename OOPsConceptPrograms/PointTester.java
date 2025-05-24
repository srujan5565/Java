class Point {
    double x,y;
    Point(double x,double y){
        setX(x);
        setY(y);
    }
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
    double distance(){
        return Math.sqrt(Math.pow(getX(),2)+Math.pow(getY(), 2));
    }
    double distance(Point point){
        return Math.sqrt(Math.pow(getX()-point.getX(),2)+Math.pow(getY()-point.getY(), 2));
    }
}
public class PointTester{
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        Point p2 = new Point(5,6);
        System.out.println(p1.distance());
        System.out.println(p1.distance(p2));
    }
}
