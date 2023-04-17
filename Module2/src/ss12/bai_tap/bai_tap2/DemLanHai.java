package ss12.bai_tap.bai_tap2;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemLanHai {
    public static void main(String[] args) {
        Map<String,Integer>map=new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mỗi chuỗi:");
        String string = scanner.nextLine();
        String[]str=string.split(" ");
        for (String s: str) {
            String word=s.toUpperCase(Locale.ROOT);
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else {
                map.put(word,1);
            }

        }
        System.out.println(map);
    }
}
