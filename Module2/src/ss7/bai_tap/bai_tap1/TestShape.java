package ss7.bai_tap.bai_tap1;

import java.util.Arrays;

public class TestShape {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Circle(3);
        shape[1] = new Rectangle(3.2,5.5);
        shape[2] = new Square(4.4);
        System.out.println(Arrays.toString(shape));
        for (Shape s : shape
        ) {
            if (s instanceof Circle) {
                System.out.println(((Circle) s).getArea());
            }
            if (s instanceof Rectangle) {
                System.out.println(((Rectangle) s).getArea());
            }
            if (s instanceof Square) {
                System.out.println(((Square) s).getArea());
            }
        }
        for (Shape s : shape
        ) {
            s.resize(Math.random() * 100);
            if (s instanceof Circle) {
                System.out.println(((Circle) s).getArea());
            }
            if (s instanceof Rectangle){
                System.out.println(((Rectangle)s).getArea());
            }
            if (s instanceof Square){
                System.out.println(((Square)s).getArea());
            }

        }
    }
}
