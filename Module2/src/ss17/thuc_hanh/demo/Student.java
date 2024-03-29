package ss17.thuc_hanh.demo;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int afe;

    public Student(int id, String name, int afe) {
        this.id = id;
        this.name = name;
        this.afe = afe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAfe() {
        return afe;
    }

    public void setAfe(int afe) {
        this.afe = afe;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", afe=" + afe +
                '}';
    }
}
