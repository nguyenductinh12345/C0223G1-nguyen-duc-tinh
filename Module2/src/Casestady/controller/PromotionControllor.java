package Casestady.controller;

import java.util.Scanner;

public class PromotionControllor {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;

    public void displayPromotion() {
        do {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n" +
                    "Please enter number\n");
            choice = Integer.parseInt(scanner.nextLine());
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng lựa chọn trong khoảng từ 1 đến 3");
            } catch (Exception e) {
                System.out.println("Vui lòng lựa chọn trong khoảng từ 1 đến 3");
            }
             switch (choice){
                 case 1:
                     break;
                 case 2:
                     break;
                 case 3:
                     break;
                 default:
                     System.out.println("bạn nhập sai chức năng vui lòng nhập lại");
             }
        } while (choice != 3);
    }
}
