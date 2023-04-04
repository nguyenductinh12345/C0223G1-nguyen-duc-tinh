package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số X cần chèn: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí muốn chèn : ");
        int viTri = Integer.parseInt(sc.nextLine());
        if (viTri <= -1 || viTri > arr.length) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i == viTri) {
                    for (int j = 0; j < arr.length - 1; j++) {
                        arr[arr.length - 1 - j] = arr[arr.length - 2 - j];
                        if (arr.length - 2 - j == viTri) {
                            break;
                        }
                    }
                    arr[viTri] = x;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
