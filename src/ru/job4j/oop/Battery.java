package ru.job4j.oop;

public class Battery {
    private int power;

    public Battery(int size) {
        this.power = size;
    }

    public void exchange(Battery another) {
        another.power = another.power + this.power;
        this.power = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(15);
        Battery second = new Battery(6);
        System.out.println("first : " + first.power + ". second : " + second.power);
        first.exchange(second);
        System.out.println("first : " + first.power + ". second : " + second.power);
    }

}
