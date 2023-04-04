package ss3.bai_tap;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 21, 3, 24},
                {5, 6, 17, 8},
                {9, 10, 18, 12},
                {13, 14, 15, 19}
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("tổng của đường chéo đầu tiên là: " + sum);
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1 - i; j >= 0; j--) {
                sum2 += arr[i][j];
                break;
            }
        }
        System.out.println("Tổng của đường chéo thứ 2 là: " + sum2);
    }
}
