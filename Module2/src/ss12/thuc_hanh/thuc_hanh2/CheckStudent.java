package ss12.thuc_hanh.thuc_hanh2;

import java.util.*;

public class CheckStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Tinh", 25, "QN");
        Student student3 = new Student("Khue", 25, "DN");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println(".......Set");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student3);
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }
        LinkedHashMap<Student,Integer> studentIntegerLinkedHashMap = new LinkedHashMap<>();
        studentIntegerLinkedHashMap.put(student1,0);
        studentIntegerLinkedHashMap.put(student2,0);
        studentIntegerLinkedHashMap.put(student3,0);
        System.out.println("LinkedHaskMap nha");
        for (Map.Entry<Student, Integer> student : studentIntegerLinkedHashMap.entrySet()) {
            System.out.println(student.toString());
        }
    }
}
