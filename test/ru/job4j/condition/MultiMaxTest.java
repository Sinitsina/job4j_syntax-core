package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5,8,16);
        assertThat(result, is(16));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(20, 10,5);
        assertThat(result, is(20));
    }

    @Test
    public void whenNumbersEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(5,5,5);
        assertThat(result, is(5));
    }
}