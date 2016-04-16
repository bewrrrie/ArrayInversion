package it.sevenbits.arrays;

/**
 * Interface needed for storing Array class methods.
 * @param <T> - generic type.
 */
public interface IArray<T> {

    /**
     * Set value to array element.
     * @param i - element index.
     * @param value - element value.
     */
    void set(final int i, final T value);

    /**
     * @param i - element index.
     * @return array element.
     */
    T get(final int i);

    /**
     * @return array length.
     */
    int getLength();
}
