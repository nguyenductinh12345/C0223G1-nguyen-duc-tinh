package ss12.bai_tap.bai_tap2;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemLanBon {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi cần check:");
        String string = scanner.nextLine();
        String[] str = string.split(" ");
        for (String s : str) {
            String tuMoi = s.toUpperCase(Locale.ROOT);
            if (map.containsKey(tuMoi)) {
                map.put(tuMoi, map.get(tuMoi) + 1);
            } else {
                map.put(tuMoi, 1);
            }
        }
        System.out.println(map);
    }
}
