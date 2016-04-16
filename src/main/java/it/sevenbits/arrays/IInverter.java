package it.sevenbits.arrays;

/**
 * Interface needed for storing Inverter class methods.
 */
public interface IInverter {

    /**
     * Invert array.
     * @param <T> - generic type.
     * @param inputArray - array of T.
     * @return inverted array.
     * @throws NullPointerException
     */
    <T> IArray<T> invert(final IArray<T> inputArray) throws NullPointerException;
}
