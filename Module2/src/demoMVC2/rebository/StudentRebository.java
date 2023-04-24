package demoMVC2.rebository;

import demoMVC2.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRebository implements IStudentRebository{
   public static List<Student>studentList=new ArrayList<>();
    static {Student student1 = new Student(1,"Tinh",26,true);
        Student student2 = new Student(2,"San",24,true);
        Student student3 = new Student(3,"Y Lan",26,false);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
    }
    @Override
    public List<Student> getListStudent() {
        return studentList;
    }

    @Override
    public void addNewStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteStudent(int index) {
        studentList.remove(index);
    }

    @Override
    public void editStudent(int index, int editId, String editName, int editAge, boolean editGen) {
        studentList.get(index).setId(editId);
        studentList.get(index).setName(editName);
        studentList.get(index).setAge(editAge);
        studentList.get(index).setGen(editGen);
    }

}

