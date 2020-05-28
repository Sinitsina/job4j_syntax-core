package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double firstResult = x2 - x1;
        double secondResult = y2 - y1;
        double rsl = Math.sqrt(Math.pow(firstResult, 2) + Math.pow(secondResult, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
