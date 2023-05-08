package demoAnimal.controller;

import demoAnimal.service.AnimalService;

import java.util.Scanner;

public class AnimalController {
    Scanner scanner = new Scanner(System.in);
    AnimalService animalService = new AnimalService();
    public void showMenu(){
        int choice = 0;
        do {
            System.out.println("----------Quản lý động vật -------------\n" +
                    "1. Hiển thị danh sách động vật\n" +
                    "2. Thêm mới động vật\n" +
                    "3. Sửa động vật theo id\n" +
                    "4. Xoá động vật theo id\n" +
                    "5. thoát\n" +
                    "Vui lòng lựa chọn thao tác từ 1 đến 5");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ cái");
            }
            switch (choice){
                case 1:
                    animalService.showAnimal();
                    break;
                case 2:
                    animalService.addAnimal();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.err.println("Vui lòng lựa chọn trong khoảng từ 1 đến 5");
                    break;
            }
        }while (choice!=5);

    }
}
