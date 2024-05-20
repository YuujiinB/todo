package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Init ArrayList
        ArrayList<TodoElement> userList = new ArrayList<>();
        // Init Scanner
        Scanner userOption = new Scanner(System.in);

        while (true) {
            // Asking user what to do
            System.out.println("What do you wish to do?");
            System.out.println("1. Add to-do");
            System.out.println("2. Delete a to-do");
            System.out.println("3. Display to-do list");
            System.out.println("4. Exit");
            int todo = userOption.nextInt();

            // Asking user on basis
            switch (todo) {
                case 1: // Add
                    Scanner userInput = new Scanner(System.in);
                    System.out.println("What do you wish to add to your to-do?");
                    String userAdds = userInput.nextLine();
                    userList.add(new TodoElement(userAdds));
                    break;

                case 2: // Delete
                    if (userList.isEmpty()) {
                        System.out.println("Your to-do list is empty.");
                    } else {
                        Scanner userDelete = new Scanner(System.in);
                        System.out.println("Which to-do do you wish to delete?");
                        for (int i = 0; i < userList.size(); i++) {
                            System.out.println((i + 1) + ". " + userList.get(i));
                        }
                        int userDeletes = userDelete.nextInt();
                        if (userDeletes > 0 && userDeletes <= userList.size()) {
                            userList.remove(userDeletes - 1);
                            System.out.println("Item deleted.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;

                case 3: // Display
                    if (userList.isEmpty()) {
                        System.out.println("Nothing in your list.");
                    } else {
                        System.out.println("Your to-do list:");
                        for (int i = 0; i < userList.size(); i++) {
                            System.out.println((i + 1) + ". " + userList.get(i));
                        }
                    }
                    break;

                case 4: // Exit program
                    System.out.println("Exiting...");
                    System.exit(0);

                default: // Prompt user to redo
                    System.out.println("Enter a valid option.");
                    break;
            }
        }
    }
}