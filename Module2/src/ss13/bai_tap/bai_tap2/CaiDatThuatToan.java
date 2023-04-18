package ss13.bai_tap.bai_tap2;

import java.util.Arrays;
import java.util.Scanner;

public class CaiDatThuatToan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của chuỗi số muốn tạo:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arrayint = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào số thứ " + (i + 1));
            int inputInter = Integer.parseInt(scanner.nextLine());
            arrayint[i] = inputInter;
        }
        System.out.println("Nhập vào số muốn tìm:");
        int num = Integer.parseInt(scanner.nextLine());
        Arrays.sort(arrayint);
        System.out.println(Arrays.toString(arrayint));
        System.out.println(binarySearch(arrayint, 0, arrayint.length - 1, num));

    }

    public static int binarySearch(int[] array, int left, int right, int value) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào số bạn muốn tìm:");
//        value = Integer.parseInt(scanner.nextLine());
        int mid = (left + right) / 2;
        if (array[mid] == value) {
            return mid;
        } else if (value > array[mid]) {
            left = mid + 1;
        } else if (value < array[mid]) {
            right = mid - 1;
        }
        if (left > right) {
            return -1;
        }
        return binarySearch(array, left, right, value);

    }
}
