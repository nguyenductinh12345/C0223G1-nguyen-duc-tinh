package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        int[] arr3 = new int[11];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " cho mảng 1: ");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " cho mảng 2: ");
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i]= arr2[i- arr1.length];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
