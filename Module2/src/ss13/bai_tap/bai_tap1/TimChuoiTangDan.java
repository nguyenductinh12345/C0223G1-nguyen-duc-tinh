package ss13.bai_tap.bai_tap1;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi ký tự:");
        String str = scanner.nextLine();
        String[] strLine = str.split("");
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < strLine.length; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < strLine.length; j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character cha : max) {
            System.out.print(cha);
        }
        System.out.println();
    }
}
