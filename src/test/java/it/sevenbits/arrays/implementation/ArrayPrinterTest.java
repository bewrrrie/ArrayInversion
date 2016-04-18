package it.sevenbits.arrays.implementation;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * ArrayPrinter class unit test.
 */
public class ArrayPrinterTest {
    private ArrayPrinter printer;
    private ByteArrayOutputStream output;

    @Before
    public void setUp() {
        this.printer = new ArrayPrinter();
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testPrintInteger() throws NullPointerException {
        Array<Integer> testArray = new Array<Integer>(new Integer[]{1, 2, 3, 4});
        printer.print(testArray);

        assertEquals("{1, 2, 3, 4}\n", getOut());
    }

    @Test
    public void testPrintDouble() throws NullPointerException {
        Array<Double> testArray = new Array<Double>(new Double[]{1.1, 2.2, 3.3, 4.4});
        printer.print(testArray);

        assertEquals("{1.1, 2.2, 3.3, 4.4}\n", getOut());
    }

    @Test
    public void testPrintString() throws NullPointerException {
        Array<String> testArray = new Array<String>(new String[]{"A", "AB", "ABC", "ABCD"});
        printer.print(testArray);

        assertEquals("{A, AB, ABC, ABCD}\n", getOut());
    }

    @Test
    public void testPrintChar() throws NullPointerException {
        Array<Character> testArray = new Array<Character>(new Character[]{'a', 'b', 'c', 'd'});
        printer.print(testArray);

        assertEquals("{a, b, c, d}\n", getOut());
    }

    @Test (expected = NullPointerException.class)
    public void testPrintNull() throws NullPointerException {
        Array<Integer> testArray = null;
        printer.print(testArray);

        fail();
    }

    String getOut() {
        return new String(output.toByteArray());
    }
}
