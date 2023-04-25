package Casestady.controller;

import java.util.Scanner;

public class FacilityControllor {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    public void displayFacility(){
        do {
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display lis facility maintenance\n" +
                    "4. Return main menu\n" +
                    "Please enter number\n");
            choice = Integer.parseInt(scanner.nextLine());

        }while (choice!=4);
    }
}
