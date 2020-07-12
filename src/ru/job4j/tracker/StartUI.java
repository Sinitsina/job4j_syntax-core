package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println(tracker.getItems().toString());
            } else if (select == 2) {
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.replace(id, item);
                if (tracker.replace(id, item)) {
                    System.out.println("Item with id " + id + "was successfully replaced.");
                } else {
                    System.out.println("Unfortunately Item with id " + id + "was not found and replaced.")
                }
            } else if (select == 3) {
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.replace(id)) {
                    System.out.println("Item with id " + id + "was successfully deleted.");
                } else {
                    System.out.println("Unfortunately Item with id " + id + "was not found and deleted.")
                }
            } else if (select == 4) {
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                tracker.findById(id);
            } else if (select == 5) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                tracker.findByName(name);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu."
                + "\n" + "0. Add new Item"
                + "\n" + "1. Show all items"
                + "\n" + "2. Edit item"
                + "\n" + "3. Delete item"
                + "\n" + "4. Find item by Id"
                + "\n" + "5. Find items by name"
                + "\n" + "6. Exit Program"
                + "\n" + "Select:");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

    /*public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item1 = new Item();
        item1.setName("Declaration");

        tracker.add(item1);
        System.out.println(tracker.findById(1));
    }*/
}
