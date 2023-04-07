package ss5.bai_tap.bai_tap1;

public class Circle {
    private double radius = 5.0;
    private String color = "red";

    public Circle() {
    }
    public Circle(double r){
        this.radius=r;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' +"Area= "+getArea()+ '}';
    }
}
