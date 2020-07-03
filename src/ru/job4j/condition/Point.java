package ru.job4j.condition;

import static java.lang.StrictMath.sqrt;
import static java.lang.StrictMath.pow;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double result = first.distance(second);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
