package ss15.bai_tap;

import javax.swing.*;
import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài cạnh thứ nhât:");
        double canh1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào chiều dài cạnh thứ hai của tam giác:");
        double canh2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào cạnh thứ ba của tam giác:");
        double canh3 = Double.parseDouble(scanner.nextLine());
        try {
            check(canh1,canh2,canh3);
            System.out.println("ok");
        }
        catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
    public static void  check(double canh1, double canh2, double canh3) throws IllegalTriangleException{
        if (canh1 <= 0 || canh2 <= 0 || canh3 <= 0 ||
                (canh1 + canh2) <= canh3 || (canh1 + canh3) <= canh2 || (canh2 + canh3) <= canh1){
            throw  new IllegalTriangleException(" tam giác không hợp lệ");
        }

    }
}
