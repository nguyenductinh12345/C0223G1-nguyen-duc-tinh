package demoMVC2.service;

import demoMVC2.model.Student;
import demoMVC2.rebository.StudentRebository;

import java.util.Scanner;

public class StudentService implements IStudentService {
    StudentRebository studentRebository = new StudentRebository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void showStudent() {
        for (Student s : studentRebository.getListStudent()) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewStudent() {
        System.out.println("Nhập íd của học sinh muốn thêm:");
        int newId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên của học sinh mới:");
        String neuName = scanner.nextLine();
        System.out.println("Nhập tuổi của học sinh muốn thêm:");
        int newAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính của học sinh muốn thêm\n" +
                "1.Nam\n" +
                "khác 1 là nữ.");
        int newGen = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        if (newGen == 1) {
            flag = true;
        }
        Student newStudent = new Student(newId, neuName, newAge, flag);
        studentRebository.addNewStudent(newStudent);
        System.out.println("Thêm học sinh thành công:");
        this.showStudent();

    }

    @Override
    public void deleteStudent() {
        this.showStudent();
        System.out.println("Nhập id học sinh muốn xoá:");
        int deleteId = Integer.parseInt(scanner.nextLine());
        int index = 0;
        boolean check = false;
        for (int i = 0; i < studentRebository.getListStudent().size(); i++) {
            if (deleteId == studentRebository.getListStudent().get(i).getId()) {
                index = i;
                check = true;
            }
        }
        if (check) {
            System.out.println("Bạn có chắc chắn muốn xoá học sinh có id là " + deleteId + " không?\n" +
                    "1.ok\n" +
                    "2.No\n" +
                    "Chọn 1 hoặc 2 để xoá hoặc không");
            int xacNhan = Integer.parseInt(scanner.nextLine());
            if (xacNhan == 1) {
                studentRebository.deleteStudent(index);
                System.out.println("Đã xoá thành công");
                this.showStudent();
            } else {
                System.out.println("Xoá không thành công");
            }
        } else {
            System.out.println("không tìm thấy id học sinh cần xoá");
        }
    }

    @Override
    public void editStudent() {
        this.showStudent();
        System.out.println("Nhập id học sinh muốn sửa:");
        int editId = Integer.parseInt(scanner.nextLine());
        int index = 0;
        boolean flag = true;
        for (int i = 0; i < studentRebository.getListStudent().size(); i++) {
            if (editId == studentRebository.getListStudent().get(i).getId()) {
                index = i;
                flag = false;
            }
        }
        if (flag) {
            System.out.println("koong tìm thấy id học sinh cần sửa");
        } else {
            System.out.println("Nhập id mới:");
            int newId = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên mới:");
            String newName = scanner.nextLine();
            System.out.println("Nhập tuổi mới:");
            int newAge = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập giới tính mới:\n" +
                    "1.Nam\n" +
                    "2,Nữ");
            int xacNhan = Integer.parseInt(scanner.nextLine());
            boolean genfloat = false;
            if (xacNhan == 1) {
                genfloat = true;
            }
            studentRebository.editStudent(index, newId, newName, newAge, genfloat);
            System.out.println("Đã sửa thành công.");
            this.showStudent();
        }
    }
}
