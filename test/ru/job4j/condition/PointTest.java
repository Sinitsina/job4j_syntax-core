package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenCoordinates10555ThenDistance5() {
        Point first = new Point(10, 5);
        Point second = new Point(5, 5);
        double expected = 5.0;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenCoordinates1111ThenDistance5() {
        Point first = new Point(1, 1);
        Point second = new Point(1, 1);
        double expected = 0.0;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}