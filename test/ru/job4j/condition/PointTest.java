package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenCoordinates10555ThenDistance5() {
        int x1 = 10;
        int y1 = 5;
        int x2 = 5;
        int y2 = 5;
        double expected = 5.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}