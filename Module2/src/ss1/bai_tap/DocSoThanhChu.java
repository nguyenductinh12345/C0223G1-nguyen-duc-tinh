package ss1.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        int chuSo = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("Nhập chữ số muốn đọc (0-999) - nhập 1000 để thoát: ");
            chuSo = sc.nextInt();
            if (chuSo > 999 || chuSo < 0) {
                System.out.print("out of ability");
                continue;
            }
            if (chuSo == 0) {
                System.out.print("zero");
                continue;
            }
            int donVi = chuSo % 10;
            int chuc = chuSo % 100 / 10;
            int tram = chuSo / 100;
            String[] hangDonVi = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                    "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String[] hangChuc = {"twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String hangTram = "hundred";
            ArrayList<String> ketQua = new ArrayList<String>();
            if (tram > 0) {
                ketQua.add(hangDonVi[tram - 1]);
                ketQua.add(hangTram);
            }
            if (chuSo % 100 < 20) {
                if (chuSo % 100 > 0) {
                    ketQua.add(hangDonVi[chuSo % 100 - 1]);
                }
            } else {
                ketQua.add(hangChuc[chuc - 2]);
                if (donVi > 0) {
                    ketQua.add(hangDonVi[donVi - 1]);
                }
            }
            System.out.print("ket qua: " + String.join(" ", ketQua).toLowerCase());

        } while (chuSo != 1000);

    }
}

