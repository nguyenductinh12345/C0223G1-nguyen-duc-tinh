package ss3.bai_tap;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String chuoi = "abcdefghabc12312311";
        char X = '1';
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == X) {
                count += 1;
            }
        }
        System.out.println("Số lần xuất hiện là: " + count);
    }
}
