package Casestady.controller;

import java.util.Scanner;

public class PromotionControllor {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    public void displayPromotion(){
        do {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n" +
                    "Please enter number\n");
            choice = Integer.parseInt(scanner.nextLine());

        }while (choice!=3);
    }
}
