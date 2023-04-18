package ss13.bai_tap.bai_tap3;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiLIenTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kỳ");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() >= 1 && string.charAt(i) <= list.getLast()) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character cha : max) {
            System.out.print(cha);
        }
        System.out.println();
    }
}
