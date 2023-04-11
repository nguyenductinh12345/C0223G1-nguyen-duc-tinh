package ss7.bai_tap.bai_tap1;

public class Circle extends Shape implements IResizeable {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius =" +
                getRadius()
                + ", with is a subclass of "
                + super.toString() +
                "Area = " + getArea() +
                "Perimeter = " + getPerimeter();
    }

    @Override
    public void resize(double percent) {
        this.radius = radius * (1 + percent / 100);
    }
}
