package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TraVeUocChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần tìm ước chung: ");
        int so = Integer.parseInt(sc.nextLine());
        int[] arr = UocChung(so);
        for (int j : arr) {
            if (j != 0) {
                System.out.println(j);
            }
        }
    }

    public static int[] UocChung(int so) {
        int[] uocChung = new int[so];
        int count = 0;
        for (int i = 1; i <= so; i++) {
            if (so % i == 0) {
                uocChung[count] = i;
                count++;
            }
        }
        return uocChung;
    }
}
