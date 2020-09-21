package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] elements = new int[5];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = (i * 2) + 3;
        }
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}
