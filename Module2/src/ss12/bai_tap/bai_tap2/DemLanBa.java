package ss12.bai_tap.bai_tap2;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemLanBa {
    public static void main(String[] args) {
        Map<String,Integer>map=new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một đoạn van bản muốn đếm số từ bên trong:");
        String string = scanner.nextLine();
        String[]str = string.split(" ");
        for (String s: str) {
            String tu =s.toUpperCase(Locale.ROOT);
            if (map.containsKey(tu)){
                map.put(tu,map.get(tu)+1);
            }else {
                map.put(tu,1);
            }
        }
        System.out.println(map);
    }
}
