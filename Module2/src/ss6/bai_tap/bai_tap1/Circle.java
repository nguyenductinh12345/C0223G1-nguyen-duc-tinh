package ss6.bai_tap.bai_tap1;

public class Circle {
    private double radius =3;
    private String collor = "red";
    public Circle(){

    }

    public Circle(double radius, String collor) {
        this.radius = radius;
        this.collor = collor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getCollor() {
        return collor;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", collor='" + collor + '\'' +
                "Area= "+getArea()+" "+
                "Perimeter= "+getPerimeter()+
                '}';
    }
}
