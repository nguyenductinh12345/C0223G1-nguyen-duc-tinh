package ss3.bai_tap;

import java.util.Arrays;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {0, 11, 23, 24, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0};
        int x = 7;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Vị trí số cần xoá là: " + i);
            }
        }
        for (int i = 10; i < arr.length - 1; i++) {
            int rong = 0;
            rong = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = rong;
        }
        arr[arr.length - 1] = 0;
        System.out.println("Mảng sau khi xoá phần tử X là: ");
        System.out.println(Arrays.toString(arr));
    }
}
