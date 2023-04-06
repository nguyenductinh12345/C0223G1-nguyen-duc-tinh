package ss3.bai_tap;
import java.util.Scanner;
public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println(check(year));
    }
    public static Boolean check(int year) {
        boolean namNhuan = false;
        if ((year % 4 == 0 && year != 100) || (year % 100 == 0 && year % 400 == 0)) {
            return true;
        }
        return namNhuan;
    }
}
