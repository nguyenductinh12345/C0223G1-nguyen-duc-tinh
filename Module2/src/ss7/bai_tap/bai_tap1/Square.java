package ss7.bai_tap.bai_tap1;

public class Square extends Shape implements IResizeable {
    private double side = 1.0;

    public Square() {

    }

    public Square(double side) {
        this.side = side;

    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side = this.side *(1 + percent / 100);
    }
}
