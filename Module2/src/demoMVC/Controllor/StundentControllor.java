package demoMVC.Controllor;

import demoMVC.service.StudentService;

import java.util.Scanner;

public class StundentControllor {
    StudentService studentService = new StudentService();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        int choice = 0;
        do {
            System.out.println("-------------Quản lý sinh viên------------\n" +
                    "1.Hiển thị học sinh\n" +
                    "2.Thêm học sinh\n" +
                    "3.Sửa học sinh\n" +
                    "4.Xoá học sinh\n" +
                    "0.Thoát\n" +
                    "Xin chọn chức năng ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentService.showStudent();
                    break;
                case 2:
                    studentService.addNewStudent();
                    break;
                case 3:
                    studentService.editStudent();
                    break;
                case 4:
                    studentService.deleteStudent();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Bạn nhập sai vui lòng nhập lại");
                    break;

            }


        } while (choice != 0);
    }
}
