package job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

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

    @Test
    public void whenCoordinates004004ThenDistance3D56() {
        Point first = new Point(0, 4, 0);
        Point second = new Point(0, 0, 4);
        double expected = 5.65;
        double out = first.distance3D(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenCoordinates025184ThenDistance3D616() {
        Point first = new Point(0, 2, 5);
        Point second = new Point(1, 8, 4);
        double expected = 6.16;
        double out = first.distance3D(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}