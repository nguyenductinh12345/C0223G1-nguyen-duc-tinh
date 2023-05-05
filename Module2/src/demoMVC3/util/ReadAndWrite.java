package demoMVC3.util;

import demoMVC3.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<Student> readFile() {
        List<Student> studentList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader
                    ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/demoMVC3/data/Student.csv"));
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null || line.equals("")) {
                    break;
                }
                String[] arr = line.split(",");
                Student student = new Student(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
                studentList.add(student);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }

    public void writeFile(List<Student> studentlist) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                    ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/demoMVC3/data/Student.csv"));
            for (Student s : studentlist) {
                bufferedWriter.write(s.getintoCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
