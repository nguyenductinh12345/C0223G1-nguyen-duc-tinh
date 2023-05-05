package Casestady.controller;

import Casestady.service.CustomerService;
import Casestady.service.interfaceService.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    CustomerService customerService = new CustomerService();
    public void displayCustomer() {
        do {
            System.out.println("1.Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit sustomer\n" +
                    "4. Retirn main menu\n" +
                    "Please enter number\n");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng lựa chọn từ 1 đến 4");
            }
            switch (choice) {
                case 1:
                    customerService.showCustomer();
                    break;
                case 2:
                    customerService.addCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
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
