package com.github.javadojo.fizzbuzz;

/**
 * An implementation of the {@link FizzBuzz} definition.
 */
public class FizzBuzzImpl extends FizzBuzz {

    /**
     * This {@code main} method prints the {@link #fizzbuzz(int)} values from
     * {@code 1} to {@code 100}.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        new FizzBuzzImpl().runFizzBuzz();
    }

    /** {@inheritDoc} */
    @Override
    public String fizzbuzz(int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * This method prints the {@link #fizzbuzz(int)} values from {@code 1} to
     * {@code 100}.
     */
    public void runFizzBuzz() {
        for (String fb: fizzbuzzes(1, 100)) {
            System.out.println(fb);
        }
    }

}
