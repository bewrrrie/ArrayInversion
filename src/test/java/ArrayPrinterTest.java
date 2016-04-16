import it.sevenbits.arrays.implementation.Array;
import it.sevenbits.arrays.implementation.ArrayPrinter;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

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
    public void testPrint() {
        Array<String> testArray = new Array<String>(new String[]{"A", "AB", "ABC", "ABCD"});
        printer.print(testArray);

        assertEquals("{A, AB, ABC, ABCD}\n", getOut());
    }

    String getOut() {
        return new String(output.toByteArray());
    }
}
