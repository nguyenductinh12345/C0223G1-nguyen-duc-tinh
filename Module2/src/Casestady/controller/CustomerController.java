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
            choice = Integer.parseInt(scanner.nextLine());
        }while (choice!=4);
    }
}
