package demoMVC3.controller;

import demoMVC3.service.StudentService;

import java.util.Scanner;

public class StudentController {
    Scanner scanner = new Scanner(System.in);
    StudentService studentService = new StudentService();
    public void showMenu(){
        int choice = 0;
        do {
        System.out.println("---------------Quản lý học sinh----------------\n" +
                "1.Hiển thị học sinh\n" +
                "2.Thêm học sinh mới\n" +
                "3.Edit học sinh\n" +
                "4.Xoá học sinh\n" +
                "5.Thoát\n"+
                "vui lòng lựa chon chức năng muốn thao tác");
        try {
            choice=Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Vui lòng không nhập chữ cái");
        }

            switch (choice){
            case 1:
                studentService.display();
                break;
            case 2:
                studentService.addStudent();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.err.println("Vui lòng nhập lựa chọn trong khoảng từ 1 đến 5");
        }
        }while (choice!=5);
    }

}
