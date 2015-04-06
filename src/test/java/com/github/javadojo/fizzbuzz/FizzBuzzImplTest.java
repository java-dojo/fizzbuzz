package com.github.javadojo.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzImplTest {

    private final FizzBuzz objectToTest = new FizzBuzzImpl();

    private final String[] fizzBuzzResults = {
        "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
        "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
        "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz",
        "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz",
        "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz",
        "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz",
        "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz",
        "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz",
        "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
        "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz",
    };

    @Test(enabled = false)
    public void testOne() {
        Assert.assertEquals(objectToTest.fizzbuzz(1), "1",
            "Expected the value 1 for input 1.");
    }

    @Test(enabled = false)
    public void testTwo() {
        Assert.assertEquals(objectToTest.fizzbuzz(2), "2",
            "Expected the value 2 for input 2.");
    }

    @Test(enabled = false)
    public void testThree() {
        Assert.assertEquals(objectToTest.fizzbuzz(3), "Fizz",
            "Expected the value Fizz for input 3.");
    }

    @Test(enabled = false)
    public void testFive() {
        Assert.assertEquals(objectToTest.fizzbuzz(5), "Buzz",
            "Expected the value Buzz for input 5.");
    }

    @Test(enabled = false)
    public void testFifteen() {
        Assert.assertEquals(objectToTest.fizzbuzz(15), "FizzBuzz",
            "Expected the value FizzBuzz for input 15.");
    }

    @Test(enabled = false)
    public void testFizzBuzzes() {
        Assert.assertEquals(objectToTest.fizzbuzzes(1, 100).toArray(),
            fizzBuzzResults,
            "Expected the.results from the array.");
    }

}
