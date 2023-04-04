package ss3.bai_tap;

public class TimSoNhoNhat {
    public static void main(String[] args) {
        int[][] arr = {
                {312, 312, 4321, 21, 24},
                {21, 2, 43, 54, 6553},
                {421, 435, 213, 543, 856}
        };
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Số nhỏ nhất của mảng là: " + min);
    }
}
