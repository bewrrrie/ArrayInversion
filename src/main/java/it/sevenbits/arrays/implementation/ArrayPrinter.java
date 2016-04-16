package it.sevenbits.arrays.implementation;

import it.sevenbits.arrays.IArrayPrinter;

/**
 * Class needed for printing array elements.
 */
public class ArrayPrinter implements IArrayPrinter {

    /**
     * Print array elements.
     * @param array - input.
     * @param <T> - generic type.
     * @throws NullPointerException
     */
    public <T> void print(final Array<T> array) throws NullPointerException {
        System.out.print("{");
        for (int i = 0; i < array.getLength() - 1; i++) {
            System.out.print(array.get(i) + ", ");
        }
        System.out.println(array.get(array.getLength() - 1) + "}");
    }
}
