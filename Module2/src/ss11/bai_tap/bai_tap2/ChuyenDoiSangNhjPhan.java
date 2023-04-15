package ss11.bai_tap.bai_tap2;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiSangNhjPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số muốn chuyển sang hệ nhị phân: ");
        int inputInter = Integer.parseInt(scanner.nextLine());
        while (inputInter != 0) {
            int a = inputInter % 2;
            stack.push(a);
            inputInter /= 2;
        }
        String str = "";
        int s;
        while (!(stack.isEmpty())) {
            s= stack.pop();
            str+=s;
        }

        System.out.println(" sau khi được chuyển qua hệ nhị phân là: "+ str);
    }
}
