package demoMVC3.repository;

import demoMVC3.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getList();
    void addStudent(List<Student> studentList);
}
