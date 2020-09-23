package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void whenMan202ThenWeight117() {
        double in = 202.0;
        double expected = 117.3;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170ThenWeight69() {
        double in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }
}