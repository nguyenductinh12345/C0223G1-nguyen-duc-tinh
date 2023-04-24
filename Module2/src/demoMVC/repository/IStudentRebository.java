package demoMVC.repository;

import demoMVC.model.Stundent;

import java.util.ArrayList;
import java.util.List;

public interface IStudentRebository {
    List<Stundent> getListStudent();

    void addNewStudent(Stundent stundent);

    void deleteStudent(int index);

    void editStudent(int index, int id, String name, int age, String email, boolean gen);
}
