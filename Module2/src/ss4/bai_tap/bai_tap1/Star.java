package ss4.bai_tap.bai_tap1;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tham số a: ");
        double a = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tham số b: ");
        double b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tham số c: ");
        double c = Integer.parseInt(sc.nextLine());
        QuadraticEquation phuongTrinh = new QuadraticEquation(a, b, c);
        double delta = phuongTrinh.getDiscriminant();
        double nghiem1 = phuongTrinh.getRoot1();
        double nghiem2 = phuongTrinh.getRoot2();
        if (delta > 0) {
            System.out.println("Nghiệm đầu tiên là: " + nghiem1);
            System.out.println("Nghiệm thứ 2 là: " + nghiem2);
        } else if (delta == 0) {
            double X1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép là " + X1);
        } else {
            System.out.println("Phuong trình vô nghiệm");
        }
    }
}
