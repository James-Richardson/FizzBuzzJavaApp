package org.example;

import org.example.pojo.FizzBuzzValue;

import java.util.function.IntFunction;

/**
 * @author James Richardson
 */
class FizzBuzz {

    static final IntFunction<FizzBuzzValue> toFizzBuzzValue = i -> new FizzBuzzValue(i, i % 3 == 0, i % 5 == 0);

    private FizzBuzz() {}
}
