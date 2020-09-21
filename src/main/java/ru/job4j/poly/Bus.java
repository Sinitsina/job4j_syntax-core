package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int passenger) {

    }

    @Override
    public int refuel(int liters) {
        int price = 2;
        return price * liters;
    }
}
