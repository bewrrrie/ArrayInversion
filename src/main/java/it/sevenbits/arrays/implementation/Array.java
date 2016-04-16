package it.sevenbits.arrays.implementation;

import it.sevenbits.arrays.IArray;

/**
 * Array class.
 * @param <T> - generic type.
 */
public class Array<T> implements IArray<T> {
    private T[] array;

    /**
     * Constructor.
     * @param array - input array.
     */
    public Array(final T[] array) {
        this.array = array;
    }

    /**
     * Set element.
     * @param i - index.
     * @param value - element value.
     */
    public void set(final int i, final T value) {
        array[i] = value;
    }

    /**
     * @param i - element index.
     * @return array element.
     */
    public T get(final int i) {
        return array[i];
    }

    /**
     * @return array length.
     */
    public int getLength() {
        return array.length;
    }

    /**
     * @return array.
     */
    public T[] getArray() {
        return array;
    }
}
