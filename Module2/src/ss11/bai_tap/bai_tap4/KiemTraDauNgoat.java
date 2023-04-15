package ss11.bai_tap.bai_tap4;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoat {
    public static void main(String[] args) {
        Stack<Character> bStack = new Stack<>();
        Stack<Character> cStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào đoạn toán học muốn check dấu ngoặc");
        String str = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bStack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                cStack.push(str.charAt(i));
            }
            if (cStack.size() > bStack.size()) {
                flag = false;
                break;
            }

        }
        if (flag = true && cStack.size() == bStack.size()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
