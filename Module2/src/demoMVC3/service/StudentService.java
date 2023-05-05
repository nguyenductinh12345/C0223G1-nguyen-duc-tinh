package demoMVC3.service;

import demoMVC3.model.Student;
import demoMVC3.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService{
    StudentRepository studentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        List<Student>studentList = studentRepository.getList();
        for (Student s:studentList) {
            System.out.println(s);
        }
    }

    @Override
    public void addStudent() {
        System.out.println("Vui lòng nhập id của học sinh");
        Student student = new Student("1","fwe","vsa","vs","fvs","vfs","fvs");
        List<Student>studentList = studentRepository.getList();
        studentList.add(student);
        studentRepository.addStudent(studentList);
    }
}
