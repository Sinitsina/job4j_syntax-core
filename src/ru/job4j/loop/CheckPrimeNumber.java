package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int i = 2;
        if (number == 1) {
            prime = false;
        }
        while (number > i) {
            if (number % i == 0) {
                prime = false;
                break;
            }
            i++;
        }
        return prime;
    }
}
