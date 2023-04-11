package ss7.bai_tap.bai_tap1;

public class Rectangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;

    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double grtPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ",which is a subclass of " +
                super.toString() +
                "Area = " + getArea() +
                "Perimeter = " + grtPerimeter()
                ;
    }

    @Override
    public void resize(double percent) {
        this.length=this.length*(1+percent/100);
        this.width=this.width*(1+percent/100);
    }
}
