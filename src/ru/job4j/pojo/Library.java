package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", 1500);
        Book book2 = new Book("Clean code", 450);
        Book book3 = new Book("Three piglets", 48);
        Book book4 = new Book("Harry Potter", 330);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getPage());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        System.out.println("After changing");
        for(Book b : books) {
            System.out.println(b.getName() + " - " + b.getPage());
        }

        for(Book b : books) {
            if (b.getName().equals("Clean code")) {
                System.out.println(b.getName() + " - " + b.getPage());
            }
        }

    }
}
