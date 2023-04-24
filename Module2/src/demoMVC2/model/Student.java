package demoMVC2.model;

public class Student {
    private int id;
    private String name;
    private int age;
    private boolean gen;

    public Student(int id, String name, int age, boolean gen) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gen = gen;
    }

    public Student() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gen=" + gen +
                '}';
    }
}
