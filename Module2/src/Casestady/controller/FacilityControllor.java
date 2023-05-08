package Casestady.controller;

import Casestady.service.FacilityService;

import java.util.Scanner;

public class FacilityControllor {
    FacilityService facilityService = new FacilityService();
    Scanner scanner = new Scanner(System.in);
    int choice = 0;

    public void displayFacility() {
        do {
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display lis facility maintenance\n" +
                    "4. Return main menu\n" +
                    "Please enter number\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 && choice > 4) {
                    System.out.println("Vui lòng lựa chọn trong khoảng từ 1 đến 4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng lựa chọn trong khoảng từ 1 đến 4");
            } catch (Exception e) {
                System.out.println("Vui lòng lựa chọn trong khoảng từ 1 đến 4");
            }
            switch (choice){
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    facilityService.addNewFacility();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Bạn nhập sai chức năng vui lòng nhập lại");
            }
        } while (choice != 4);
    }
}
