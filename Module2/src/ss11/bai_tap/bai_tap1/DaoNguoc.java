package ss11.bai_tap.bai_tap1;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguoc<fori> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int size = 5;
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ : " + (i + 1));
            int inputInter = Integer.parseInt(scanner.nextLine());
            stack.push(inputInter);
        }
        System.out.println("Mảng sau khi được thêm là : " + stack);
        Stack<Integer> stack1 = new Stack<>();
        int s;
        for (int i = 0; i < size; i++) {
            s = stack.pop();
            stack1.push(s);

        }
        System.out.println("mảng sau khi đảo ngược là : " + stack1);


    }
}

