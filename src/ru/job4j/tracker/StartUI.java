package ru.job4j.tracker;


public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                for (Item i : tracker.findAll(tracker.getItems())){
                    System.out.println(i);
                }
            } else if (select == 2) {
                int id = Integer.valueOf(input.askStr("Enter id: "));
                tracker.delete(id);
                if (tracker.delete(id)) {
                    System.out.println("Item with id " + id + "was successfully replaced.");
                } else {
                    System.out.println("Unfortunately Item with id " + id + "was not found and replaced.");
                }
            } else if (select == 3) {
                int id = Integer.valueOf(input.askStr("Enter id: "));
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item with id " + id + "was successfully deleted.");
                } else {
                    System.out.println("Unfortunately Item with id " + id + "was not found and deleted.");
                }
            } else if (select == 4) {
                int id = Integer.valueOf(input.askStr("Enter id: "));
                System.out.print(tracker.findById(id));
            } else if (select == 5) {
                String name = input.askStr("Enter name: ");
                for (Item i : tracker.findByName(name)){
                    System.out.println(i);
                }
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

    /*public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item1 = new Item();
        item1.setName("Declaration");

        tracker.add(item1);
        System.out.println(tracker.findById(1));
    }*/
}
