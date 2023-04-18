package ss13.bai_tap.bai_tap1;

import java.util.ArrayList;
import java.util.Scanner;

public class TimChuoiTangDan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        String string = scanner.nextLine();
        String[]arraystr=string.split("");
        ArrayList<Character>max=new ArrayList<>();
        for (int i = 0; i < arraystr.length; i++) {
            ArrayList<Character>list=new ArrayList<>();
            list.add(string.charAt(i));
            for (int j = i+1; j < arraystr.length; j++) {
                if(string.charAt(j)>list.get(list.size()-1)){
                    list.add(string.charAt(j));
                }
            }
            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character cha:max) {
            System.out.print(cha);
        }
        System.out.println();
    }
}
