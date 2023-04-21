package ss16.thuc_hanh.demo;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        String txt = "Nguyen Duc Tinh";
        String arr[] = {"Nguyen Duc Tinh", "Mai Phuoc Tai", "Long vu", "Huu Quoc"};
        Student s1 = new Student("Nguyen Duc Tinh", 26, "tinh@gmail.com");
        Student s2 = new Student("Mai Phuoc Tai", 23, "tai@gmail.com");
        Student s3 = new Student("Long Vu", 25, "Vu@gmail.com");
        Student s4 = new Student("Huu Quoc", 27, "Quoc@gmail.com");
        List<Student> list = new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(txt);
            bw.newLine();
            for (String s : arr) {
                bw.write(s);
                bw.newLine();
            }
            for (Student o : list) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while (true){
                line=br.readLine();
                if (line==null){
                    break;
                }
                System.out.println(line);
            }

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
