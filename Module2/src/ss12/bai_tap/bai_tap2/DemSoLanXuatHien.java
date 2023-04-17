package ss12.bai_tap.bai_tap2;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String string = scanner.nextLine();
        String[] str = string.split(" ");
        for (String s : str) {
            String word = s.toUpperCase(Locale.ROOT);
            if (stringIntegerMap.containsKey(word)) {
                stringIntegerMap.put(word, stringIntegerMap.get(word) + 1);
            } else {
                stringIntegerMap.put(word, 1);
            }

        }
        System.out.println(stringIntegerMap);

    }
}
