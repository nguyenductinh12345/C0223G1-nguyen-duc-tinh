package ss19.thuc_hanh.thuc_hanh3.text;

public class Text {
    public static void main(String[] args) {
        String x = "user@fpt.edu.vn";
        String y = "\\w+@\\w+(\\.\\w+){1,2}";
        if (x.matches(y)) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
    }
}