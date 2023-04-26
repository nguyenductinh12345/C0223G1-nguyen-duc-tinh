package Casestady.controller;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    EmployeeController employeeController = new EmployeeController();
    CustomerController customerController = new CustomerController();
    FacilityControllor facilityControllor = new FacilityControllor();
    BookingControllor bookingControllor = new BookingControllor();
    PromotionControllor promotionControllor = new PromotionControllor();

    public void displayMainMenu() {
        do {
            System.out.println("--------Quản lý khu furama-----------\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. BookingManagement\n" +
                    "5. Promotion Manggement\n" +
                    "6. Exit\n" +
                    "Please enter number\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 && choice > 6) {
                    System.out.println("Vui lòng nhập từ 1 đến 6");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập từ 1 đến 6");
            } catch (Exception e) {
                System.out.println("Vuu lòng nhập từ 1 đến 6");
            }
            switch (choice) {
                case 1:
                    employeeController.displayEmployee();
                    break;
                case 2:
                    customerController.displayCustomer();
                    break;
                case 3:
                    facilityControllor.displayFacility();
                    break;
                case 4:
                    bookingControllor.displayBooking();
                    break;
                case 5:
                    promotionControllor.displayPromotion();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please enter number again");
                    break;
            }
            if (choice < 1 || choice > 6) {
                System.out.println("Vui lòng lựa chọn thao tác trong khoảng từ 1 đến 6");
            }

        } while (choice != 6);

    }
}
