package demoMVC2.rebository;

import demoMVC2.model.Student;

import java.util.List;

public interface IStudentRebository {
    List<Student> getListStudent();
    void addNewStudent(Student student);
    void deleteStudent(int index);
    void editStudent(int index, int id, String name, int age, boolean gen);

}
