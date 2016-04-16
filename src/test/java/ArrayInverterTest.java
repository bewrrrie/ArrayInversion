import it.sevenbits.arrays.implementation.Array;
import it.sevenbits.arrays.implementation.ArrayInverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Array inverter class unit test.
 */
public class ArrayInverterTest {
    private ArrayInverter inverter;

    @Before
    public void setUp() {
        inverter = new ArrayInverter();
    }

    @Test
    public void testInverter() {
        Array<Integer> testArray = new Array<Integer>(new Integer[]{1, 2, 3, 4, 5});
        inverter.invert(testArray);

        assertArrayEquals("Wrong result!", new Integer[]{5, 4, 3, 2, 1}, testArray.getArray());
    }
}
