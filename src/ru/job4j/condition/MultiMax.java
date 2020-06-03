package ru.job4j.condition;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiMax {

    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = result > third ? result : third;
        return result;
    }
}
