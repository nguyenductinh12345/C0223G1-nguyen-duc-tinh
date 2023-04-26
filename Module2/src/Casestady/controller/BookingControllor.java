package Casestady.controller;

import java.util.Scanner;

public class BookingControllor {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;

    public void displayBooking() {
        do {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n" +
                    "Please enter number\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 && choice > 6) {
                    System.out.println("Vui lòng lựa chọn từ 1 đến 6");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng lựa chọn từ 1 đến 6");
            } catch (Exception e) {
                System.out.println("Vui lòng lựa chọn từ 1 đến 6");
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
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Bạn lựa chọn sai vui lòng nhập lại");
                    break;
            }

        } while (choice != 6);
    }
}
