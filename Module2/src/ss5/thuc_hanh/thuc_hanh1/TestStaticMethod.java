package ss5.thuc_hanh.thuc_hanh1;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Tinh");
        Student s2 = new Student(222, "Sang");
        Student s3 = new Student(333, "Tai");
        s1.display();;
        s2.display();;
        s3.display();
    }
}
