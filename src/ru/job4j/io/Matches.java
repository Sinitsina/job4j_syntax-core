package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        System.out.println("Enter number from 1 to 3");
        boolean player = true;
        while (matches > 0) {
            String name = player ? "Player 1" : "Player 2";
            System.out.println(name + " makes a play");
            int quantity = Integer.parseInt(input.nextLine());
            while (quantity > 3) {
                System.out.println("Enter number from 1 to 3");
                quantity = Integer.parseInt(input.nextLine());
            }
            System.out.println(matches - quantity);
            matches -= quantity;
            player = !player;
            if (matches == 0) {
                System.out.println(name + " is winner");
                break;
            }
        }
    }
}
