package ss2.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean duyet = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    duyet = false;
                }
            }
            if (duyet) {
                System.out.println(i);
            }
        }
    }
}
