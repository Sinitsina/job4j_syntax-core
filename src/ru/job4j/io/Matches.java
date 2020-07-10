package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        while(matches >= 0) {
            int player1 = Integer.valueOf(input.nextLine());;
            if (matches - player1 > 0) {
                System.out.println(matches - player1);
                matches -= player1;
                int player2 = Integer.valueOf(input.nextLine());;
                if (matches - player2 > 0) {
                    System.out.println(matches - player2);
                    matches -= player2;
                } else if (matches - player2 == 0) {
                    System.out.println("Player 2 is winner");
                }
            } else if (matches - player1 == 0) {
                System.out.println("Player 1 is winner");
            }
        }
    }
}
