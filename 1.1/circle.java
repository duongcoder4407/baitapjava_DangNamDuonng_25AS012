import java.math.MathContext;

public class circle {
    private double radius;
    private String color;

    public circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(double radius){
        double area = Math.PI*radius*radius;
        return area;
    }
}
