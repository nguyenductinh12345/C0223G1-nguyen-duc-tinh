package ss11.bai_tap.bai_tap3;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class KiemTraPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần check xem có phải là chuỗi Palindrome:");
        String str = scanner.nextLine();
        String[] arrStr = str.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < arrStr.length; i++) {
            stack.push(arrStr[i]);
            queue.offer(arrStr[i]);
        }
        boolean flat = true;
        for (int i = 0; i < arrStr.length; i++) {
            if (!stack.pop().equals(queue.remove())) {
                flat = false;
            }
        }
        if (flat) {
            System.out.println(str + " là chuỗi Palindrome");
        } else {
            System.out.println(str + " không phải là chuỗi Palindrome");
        }
    }
}
