package ss1.bai_tap;

import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd*vnd;
        System.out.println("Gá trị VND: "+ quydoi);
    }
}
