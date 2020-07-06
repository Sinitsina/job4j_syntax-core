package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3,1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5,5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5843Then8() {
        int result = Max.max(5,8,4,3);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax1067Then10() {
        int result = Max.max(10,6,7);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax6666Then6() {
        int result = Max.max(6,6,6,6);
        assertThat(result, is(6));
    }




}