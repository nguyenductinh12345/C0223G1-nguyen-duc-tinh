package ss16.thuc_hanh.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) {
        String str = "Nguyen Duc Tinh";
        String[]arr ={"NGuyen Duc TInh","Truong VAn A"};
        try {
            FileWriter fw = new FileWriter("databaye.net");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            String line="";
            for (String s:arr) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
