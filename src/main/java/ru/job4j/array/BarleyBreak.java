package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = counter;
                counter++;
                System.out.println(array[i][j]);
            }
        }
    }
}