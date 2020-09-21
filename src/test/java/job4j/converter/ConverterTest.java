package job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert70RblThen1Dollar() {
        int in = 70;
        int expected = 1;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
}