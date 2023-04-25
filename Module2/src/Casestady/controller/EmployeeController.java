package Casestady.controller;

import java.util.Scanner;

public class EmployeeController {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    public void displayEmployee(){
        do {
            System.out.println("1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n" +
                    "Please enter number");
            choice = Integer.parseInt(scanner.nextLine());

        }while (choice!=4);

    }
}
