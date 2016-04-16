package it.sevenbits.arrays.implementation;

import it.sevenbits.arrays.IArray;
import it.sevenbits.arrays.IInverter;

/**
 * Array inverter class
 */
public class ArrayInverter implements IInverter {

    /**
     * Returns an array with an inverted order of elements
     * @param <T> - generic type.
     * @param inputArray - original array.
     * @return inverted array
     * @throws NullPointerException
     */
    public <T> IArray<T> invert(final IArray<T> inputArray) throws NullPointerException {
        int halfAnArrayIndex = inputArray.getLength() / 2;

        for (int i = 0; i < halfAnArrayIndex; i++) {
            T temp = inputArray.get(i);
            inputArray.set(i, inputArray.get(inputArray.getLength() - i - 1));
            inputArray.set(inputArray.getLength() - i - 1, temp);
        }

        return inputArray;
    }
}