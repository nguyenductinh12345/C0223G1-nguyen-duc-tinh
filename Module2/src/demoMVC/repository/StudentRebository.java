package demoMVC.repository;

import demoMVC.model.Stundent;

import java.util.ArrayList;
import java.util.List;

public class StudentRebository implements IStudentRebository {
    private static List<Stundent> list = new ArrayList<>();

    static {
        Stundent stundent1 = new Stundent(1, "tinh", 26, "tinh@gmail.com", true);
        Stundent stundent2 = new Stundent(2, "sang", 24, "sang@gmail.com", true);
        Stundent stundent3 = new Stundent(3, "toan", 29, "toan@gmail.com", true);
        list.add(stundent1);
        list.add(stundent2);
        list.add(stundent3);
    }

    @Override
    public List<Stundent> getListStudent() {
        return list;
    }

    @Override
    public void addNewStudent(Stundent stundent) {
        list.add(stundent);
    }

    @Override
    public void deleteStudent(int index) {
        list.remove(index);
    }

    @Override
    public void editStudent(int index, int id, String name, int age, String email, boolean gen) {
        list.get(index).setId(id);
        list.get(index).setName(name);
        list.get(index).setAge(age);
        list.get(index).setEmail(email);
        list.get(index).setGend(gen);
    }
}
