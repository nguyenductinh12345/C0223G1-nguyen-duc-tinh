package ss2.bai_tap;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int chieuDai = 5;
        int chieuRong = 4;
        for (int i = 0; i < chieuRong; i++) {
            for (int j = 0; j < chieuDai; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class TamGiacVuong {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class TamGiacVuong2 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class TamGiacCan {
    public static void main(String[] args) {
        int dai = 5;
        for (int j = 0; j <= dai; j++) {
            for (int k = 0; k <= dai * 2 - 1; k++) {
                if (k <= dai - j || k >= dai + j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

class TamGiacCan2 {
    public static void main(String[] args) {
        int dai = 5;
        for (int i = 0; i < dai; i++) {
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }

        }
        System.out.println();
    }
}
