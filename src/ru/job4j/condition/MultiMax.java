package ru.job4j.condition;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiMax {

    public int max(int first, int second, int third) {
        int result = 0;
        if (first > second && first > third) {
            result = first;
        } else if (first < second && second > third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }
}
