package ss3.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOMoiCot {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,7,8,9,7},
                {5,6,7,8,9,8,7,6},
                {9,1,1,2,9,7,8,3}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cột muốn tính tổng: ");
        int cot = Integer.parseInt(sc.nextLine());
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][cot];
        }
        System.out.println(sum);
    }
}
