package ss4.thuc_hanh;

import java.util.Scanner;

public class ThucThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double width = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chiều rộng: ");
        double height = Integer.parseInt(sc.nextLine());
        Retangle rt = new Retangle(width,height);
        System.out.println(rt.display());
        System.out.println(rt.getArea());
        System.out.println(rt.getPerimeter());
    }

}
