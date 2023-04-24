package demoMVC.service;

import demoMVC.model.Stundent;
import demoMVC.repository.StudentRebository;

import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    StudentRebository studentRebository = new StudentRebository();

    @Override
    public void showStudent() {
        for (Stundent s : studentRebository.getListStudent()) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewStudent() {
        System.out.println("Nhập id học sinh muốn thêm:");
        int newId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên học sinh mới:");
        String newName = scanner.nextLine();
        System.out.println("Nhập tuổi của học sinh:");
        int newEag = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email học sinh:");
        String newEmail = scanner.nextLine();
        System.out.println("Nhập giới tính học viên\n" +
                "Nhập 1 là Nam\n" +
                "Khác 1 là Nữ");
        int newGen = Integer.parseInt(scanner.nextLine());
        boolean flag;
        if (newGen == 1) {
            flag = true;
        } else {
            flag = false;
        }
        Stundent stundent = new Stundent(newId, newName, newEag, newEmail, flag);
        studentRebository.addNewStudent(stundent);
        this.showStudent();
    }

    @Override
    public void deleteStudent() {
        System.out.println("Nhập id học sinh muốn xoá:");
        int deleteId = Integer.parseInt(scanner.nextLine());
        int index = 0;
        boolean check = true;
        for (int i = 0; i < studentRebository.getListStudent().size(); i++) {
            if (deleteId == studentRebository.getListStudent().get(i).getId()) {
                index = i;
                check = false;
            }
        }
        if (check == false) {
            System.out.println("Bạn có chắc chắn muốn xoá học sinh có id là " + deleteId + " khônmg ?\n" +
                    "Nhập 1 để xoá\n");
            int confirm = Integer.parseInt(scanner.nextLine());
            if (confirm == 1) {
                studentRebository.deleteStudent(index);
                System.out.println("Đã xoá thành công học sinh");
            } else {
                System.out.println("Xoá không thành công");
            }
        } else {
            System.out.println("không tìm thấy id của học sinh cần xoá.");

        }
        this.showStudent();
    }

    @Override
    public void editStudent() {
        System.out.println("Nhập id học sinh muốn sửa:");
        int deleteId = Integer.parseInt(scanner.nextLine());
        int index = 0;
        boolean flage = true;
        for (int i = 0; i < studentRebository.getListStudent().size(); i++) {
            if (deleteId == studentRebository.getListStudent().get(i).getId()) {
                index = i;
                flage = false;
            }
        }
        if (flage) {
            System.out.println("Không tìm thấy id muốn sửa");
        } else {
            System.out.println("Nhập id mới:");
            int editId = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên mới:");
            String editName = scanner.nextLine();
            System.out.println("Nhập tuổi mới:");
            int editAge = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập email mới:");
            String editEmail = scanner.nextLine();
            System.out.println("Nhập giới tính mới:\n" +
                    "Nhập 1 nếu là Nam\n " +
                    "Nhập khác 1 nếu không phải Nam");
            int editGen = Integer.parseInt(scanner.nextLine());
            boolean flag = false;
            if (editGen == 1) {
                flag = true;
            }
            studentRebository.editStudent(index, editId, editName, editAge, editEmail, flag);
            this.showStudent();
        }
    }
}

