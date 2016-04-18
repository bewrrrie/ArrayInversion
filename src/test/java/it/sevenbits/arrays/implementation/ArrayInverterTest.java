package it.sevenbits.arrays.implementation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

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
    public void testInverterInteger() throws NullPointerException {
        Array<Integer> testArray = new Array<Integer>(new Integer[]{1, 2, 3, 4, 5});
        inverter.invert(testArray);

        assertArrayEquals("Wrong result!", new Integer[]{5, 4, 3, 2, 1}, testArray.getArray());
    }

    @Test
    public void testInverterDouble() throws NullPointerException {
        Array<Double> testArray = new Array<Double>(new Double[]{1.1, 2.2, 3.3, 4.4, 5.5});
        inverter.invert(testArray);

        assertArrayEquals("Wrong result!", new Double[]{5.5, 4.4, 3.3, 2.2, 1.1}, testArray.getArray());
    }

    @Test
    public void testInverterString() throws NullPointerException {
        Array<String> testArray = new Array<String>(new String[]{"A", "AB", "ABC", "ABCD"});
        inverter.invert(testArray);

        assertArrayEquals("Wrong result!", new String[]{"ABCD", "ABC", "AB", "A"}, testArray.getArray());
    }

    @Test
    public void testInverterChar() throws NullPointerException {
        Array<Character> testArray = new Array<Character>(new Character[]{'a', 'b', 'c', 'd', 'e'});
        inverter.invert(testArray);

        assertArrayEquals("Wrong result!", new Character[]{'e', 'd', 'c', 'b', 'a'}, testArray.getArray());
    }

    @Test (expected = NullPointerException.class)
    public void testInverterNullPointer() throws NullPointerException {
        Array<Integer> testArray = null;
        inverter.invert(testArray);

        fail();
    }
}
