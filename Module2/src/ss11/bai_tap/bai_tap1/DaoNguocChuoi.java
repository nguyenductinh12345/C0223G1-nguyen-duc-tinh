package ss11.bai_tap.bai_tap1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi muốn đảo ngược: ");
        String str = scanner.nextLine();
        String[] mWord = str.split(" ");
//        System.out.println("Chuoi sau khi duoc chuyen thanh mang la"Arrays.toString(mWord));
        Stack<String> wStack = new Stack<>();
        for (int i = mWord.length - 1; i >= 0; i--) {
            wStack.push(mWord[i]);
        }
        String joinwStack = String.join(" ", wStack);
        System.out.println("Chuổi sau khi được đảo ngược là: " + joinwStack);
    }
}
