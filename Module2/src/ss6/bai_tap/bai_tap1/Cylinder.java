package ss6.bai_tap.bai_tap1;

public class Cylinder extends Circle {
    private double height=5;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;

    }

    public Cylinder(double radius, String collor) {
        super(radius, collor);
    }

    public Cylinder(double radius, String collor, double height) {
        super(radius, collor);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getvolume() {
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + " " +
                "Volume= " + getvolume() + " " +
                '}';
    }
}
