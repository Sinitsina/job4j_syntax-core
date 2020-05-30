package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TrgAreaTest {

    @Test
    public void whenSides574ThenArea9() {
        int a = 5;
        int b = 7;
        int c = 4;
        double expected = 9.79;
        double out = TrgArea.area(a, b, c);
        Assert.assertEquals(expected, out, 0.01);
    }
}