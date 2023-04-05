package ss3.bai_tap;

import java.util.Scanner;

public class KiemTraChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiềm tra: ");
        int so = Integer.parseInt(sc.nextLine());
        System.out.println(isOdd(so));
    }
    public static boolean  isOdd(int so) {
        if(so==0){
            System.out.println(so+"  là số đặt biệt");
            return true;
        }
        return so % 2 == 0;
    }
}
