package ss14.bai_tap.bai_tap2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CaiDatThoatToanSapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng muốn tạo");
        int size = Integer.parseInt(scanner.nextLine());
        int[]array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ "+(i+1));
            array[i]=scanner.nextInt();
        }
        System.out.println("mảng bạn vừa nhập là:");
        System.out.println(Arrays.toString(array));
        sapXepChen(array);
        System.out.println("mảng sau khi được sắp xếp là:\n"+Arrays.toString(array));
    }

    public static void sapXepChen(int[]array){
        int pox;
        int x;
        for (int i = 0; i < array.length; i++) {
            x=array[i];
            pox=i;
            while (pox>0&&x<array[pox-1]){
                array[pox]=array[pox-1];
                pox--;
            }
            array[pox]=x;
        }
    }
}
