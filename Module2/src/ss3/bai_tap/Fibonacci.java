package ss3.bai_tap;

public class Fibonacci {
    public static void main(String[] args) {
     int n = 100;
     int soDauTien = 0;
     int soThuHai = 1;
     int soTiepTheo;
        System.out.println("Dãy số fibonacci nhỏ hơn"+n+"là: ");
     while (soDauTien<=n){
         System.out.println(soDauTien);
         soTiepTheo=soDauTien+soThuHai;
         soDauTien=soThuHai;
         soThuHai=soTiepTheo;
     }
    }
}
