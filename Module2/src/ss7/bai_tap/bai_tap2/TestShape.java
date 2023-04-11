package ss7.bai_tap.bai_tap2;

public class TestShape {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Circle(2);
        shape[1] = new Rectangle(3, 4);
        shape[2] = new Square(6);
        for (Shape s : shape
        ) {
            if (s instanceof Circle) {
                System.out.println(((Circle) s).getArea());
            } else if (s instanceof Rectangle) {
                System.out.println(((Rectangle) s).getArea());
            } else if (s instanceof Square) {
                System.out.println(((Square) s).getArea());
            }
            if (s instanceof IColorable) {
                s.howToClor();
            }

        }

    }

}
