package ss2.bai_tap;

import java.sql.Array;
import java.util.Scanner;

public class HienThiNSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N số nguyên tố đầu tiên cần in ra: ");
        int n = Integer.parseInt(sc.nextLine());
        int dem = 0;
        for (int i = 2; i > 1; i++) {
            boolean c = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    c = false;
                    break;
                }
            }
            if (c){
                System.out.println(i);
                dem++;
            }
            if (dem==n){
                break;
            }
        }
    }
}
