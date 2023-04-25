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
            choice = Integer.parseInt(scanner.nextLine());

        }while (choice != 6);
    }
}
