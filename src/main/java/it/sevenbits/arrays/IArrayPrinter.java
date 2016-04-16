package it.sevenbits.arrays;

import it.sevenbits.arrays.implementation.Array;

/**
 * Interface needed for storing ArrayPrinter class methods.
 */
public interface IArrayPrinter {

    /**
     * Print array elements.
     * @param array - input.
     * @param <T> - generic type.
     * @throws NullPointerException
     */
    <T> void print(final Array<T> array) throws NullPointerException;
}
