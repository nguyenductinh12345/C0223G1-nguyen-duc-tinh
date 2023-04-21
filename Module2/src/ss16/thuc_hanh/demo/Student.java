package ss16.thuc_hanh.demo;

public class Student {
    private String name;
    private int agr;
    private String email;

    public Student(String name, int agr, String email) {
        this.name = name;
        this.agr = agr;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgr() {
        return agr;
    }

    public void setAgr(int agr) {
        this.agr = agr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", agr=" + agr +
                ", email='" + email + '\'' +
                '}';
    }
}
