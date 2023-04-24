package ss17.thuc_hanh.demo;

import java.io.*;
import java.lang.reflect.Array;

public class TestInputOutput {
    public static void main(String[] args) {
        String str = "C0223G1";
        String[] arr = {"Nguyen duc tinh", "nguyen van a", "nguyen van b"};
        Student student1 = new Student(1, "Nguyễn đức Tính", 26);
        Student student2 = new Student(1, "Nguyễn đức Tính", 26);
        Student student3 = new Student(1, "Nguyễn đức Tính", 26);
        FileOutputStream fos;
        {
            try {
                fos = new FileOutputStream("src/ss17/thuc_hanh/demo/Student.data");
                ObjectOutputStream ous = new ObjectOutputStream(fos);
                ous.writeObject(student1);
                ous.writeObject(str);
                for (String s : arr) {
                    ous.writeObject(s);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream fis = new FileInputStream("src/ss17/thuc_hanh/demo/Student.data");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s1 = (Student) ois.readObject();
            String stringr = (String) ois.readObject();
            System.out.println(s1);
            System.out.println(stringr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
