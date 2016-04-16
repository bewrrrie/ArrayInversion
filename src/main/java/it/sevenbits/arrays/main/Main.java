package it.sevenbits.arrays.main;

import it.sevenbits.arrays.implementation.Array;
import it.sevenbits.arrays.implementation.ArrayInverter;
import it.sevenbits.arrays.implementation.ArrayPrinter;

/**
 * Main class
 */
final class Main {
    /**
     * Private constructor.
     */
    private Main() {}

    private static final Array<Integer> testArray = new Array<Integer>(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9});

    /**
     * Main method.
     * @param args - arguments array.
     */
    public static void main(final String[] args) {
        ArrayInverter inverter = new ArrayInverter();
        ArrayPrinter printer = new ArrayPrinter();

        System.out.print("Before inverting: ");
        printer.print(testArray);
        inverter.invert(testArray);
        System.out.print("After inverting: ");
        printer.print(testArray);
    }
}