package demoMVC3.repository;

import demoMVC3.model.Student;
import demoMVC3.util.ReadAndWrite;

import java.util.List;

public class StudentRepository implements IStudentRepository{
    ReadAndWrite readAndWrite = new ReadAndWrite();

    @Override
    public List<Student> getList() {
       return readAndWrite.readFile();
    }

    @Override
    public void addStudent(List<Student> studentList) {
        readAndWrite.writeFile(studentList);
    }
}
