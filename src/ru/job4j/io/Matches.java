package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        System.out.println("Enter number from 1 to 3");
        boolean player = true;
        while(matches >= 0) {
            int quantity = Integer.valueOf(input.nextLine());
            while (quantity > 3) {
                System.out.println("Enter number from 1 to 3");
                quantity = Integer.valueOf(input.nextLine());
            }
            if (matches - quantity > 0) {
                System.out.println(matches - quantity);
                matches -= quantity;
                player = !player;
            } else if (matches - quantity == 0) {
                if (player == true) {
                    System.out.println("Player 1 is winner");
                } else if (player == false) {
                    System.out.println("Player 2 is winner");
                }
            }
        }
    }
}
