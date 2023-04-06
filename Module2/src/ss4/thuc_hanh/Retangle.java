package ss4.thuc_hanh;

public class Retangle {
    double width, height;

    public Retangle() {
    }
    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.height*this.width;
    }
}