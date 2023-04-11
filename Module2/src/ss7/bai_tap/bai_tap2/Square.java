package ss7.bai_tap.bai_tap2;

public class Square extends Shape implements IColorable {
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
        return this.side * this.side;
    }

    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void howToClor() {
        System.out.println("Color all four sides");
    }
}
