package demoMVC2.controllor;

import demoMVC2.service.StudentService;

import java.util.Scanner;

public class StudentControllor {
    Scanner scanner = new Scanner(System.in);
    StudentService studentService = new StudentService();
    public void showMenu(){
        int choice = 0;
        do {
            System.out.println("------------Quản lý học sinh--------------\n" +
                    "1.Hiển thị học sinh.\n" +
                    "2.Thêm học sinh.\n" +
                    "3.Xoá học sinh.\n" +
                    "4.Sửa học sinh.\n" +
                    "0.Thoát.\n" +
                    "Vui lòng nhập số bạn muốn thao tác.");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentService.showStudent();
                    break;
                case 2:
                    studentService.addNewStudent();
                    break;
                case 3:
                    studentService.deleteStudent();
                    break;
                case 4:
                    studentService.editStudent();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Bạn đã nhập sai vui lòng nhập lại.");
                    break;
            }



        }while (choice!=0);
    }

}
