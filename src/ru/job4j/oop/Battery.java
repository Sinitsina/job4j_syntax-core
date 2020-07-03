package ru.job4j.oop;

public class Battery {
    private int power;

    public Battery(int size) {
        this.power = size;
    }

    public void exchange(Battery another) {
        this.power = this.power - another.power;
        another.power = another.power + another.power;
    }

    public static void main(String[] args) {
        Battery first = new Battery(15);
        Battery second = new Battery(6);
        System.out.println("first : " + first.power + ". second : " + second.power);
        first.exchange(second);
        System.out.println("first : " + first.power + ". second : " + second.power);
    }

}
