package TaskCircle;

public class Circle {

    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double findArea(){
        double area = Math.PI*this.radius*this.radius;
        return area;
    }
}
