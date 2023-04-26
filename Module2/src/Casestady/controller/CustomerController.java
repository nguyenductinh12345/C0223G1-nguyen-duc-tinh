package Casestady.controller;

import java.util.Scanner;

public class CustomerController {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;

    public void displayCustomer() {
        do {
            System.out.println("1.Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit sustomer\n" +
                    "4. Retirn main menu\n" +
                    "Please enter number\n");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 && choice > 4) {
                    System.out.println("Vui lòng lựa chọn trong khoảng từ 1 đến 4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng lựa chọn từ 1 đến 4");
            } catch (Exception e) {
                System.out.println("Vui lòng lựa chọn từ 1 đến 4");
            }
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Bạn nhập sai yêu cầu vui lòng nhập lại");
                    break;
            }
        } while (choice != 4);
    }
}
