package org.example;

import org.example.pojo.FizzBuzzValue;

import java.util.function.LongFunction;

/**
 * @author James Richardson
 */
class FizzBuzz {

    static final LongFunction<FizzBuzzValue> toFizzBuzzValue = n -> new FizzBuzzValue(n, n % 3 == 0, n % 5 == 0);

    private FizzBuzz() {}
}
