package com.github.javadojo.fizzbuzz;

import java.util.LinkedList;
import java.util.List;

/**
 * This is the definition of the {@code FizzBuzz}.
 */
public abstract class FizzBuzz {

    /**
     * Returns a {@link String} representing the {@code value}. If the
     * {@code value} is a multiple of {@code 3} then "Fizz" is returned. If the
     * {@code value} is a multiple of {@code 5} then "Buzz" is returned.
     *
     * @param value the value to convert.
     * @return the converted {@code value}.
     */
    public abstract String fizzbuzz(int value);

    /**
     * Returns a list of values from the start value to the end value using
     * the method {@link #fizzbuzz(int)}.
     *
     * @param start the first value to convert.
     * @param end the last value to convert.
     * @return a list with the converted values.
     */
    public List<String> fizzbuzzes(final int start, final int end) {
        if (end < start) {
            throw new IllegalArgumentException(
                "Expected end to be greater than start.");
        }
        List<String> result = new LinkedList<>();
        for (int i = start; i <= end; i++) {
            result.add(fizzbuzz(i));
        }
        return result;
    }

}
