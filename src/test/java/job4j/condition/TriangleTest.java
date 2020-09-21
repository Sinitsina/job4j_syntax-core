package job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
    boolean result = Triangle.exist(9.0, 5.0, 5.0);
        assertThat(result, is(true));
}

    @Test
    public void whenExist2() {
        boolean result = Triangle.exist(29.0, 5.0, 7.0);
        assertThat(result, is(false));
}
}