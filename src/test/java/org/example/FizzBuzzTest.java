package org.example;

import org.example.pojo.FizzBuzzValue;
import org.junit.jupiter.api.Test;

import static org.example.FizzBuzz.toFizzBuzzValue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author James Richardson
 */
class FizzBuzzTest {

    @Test
    public void test1IsNeitherFizzNorBuzz() {
        FizzBuzzValue value = toFizzBuzzValue.apply(1);

        assertFalse(value.isFizz());
        assertFalse(value.isBuzz());
    }

    @Test
    public void test3IsFizzButNotBuzz() {
        FizzBuzzValue value = toFizzBuzzValue.apply(3);

        assertTrue(value.isFizz());
        assertFalse(value.isBuzz());
    }

    @Test
    public void test5IsBuzzButNotFizz() {
        FizzBuzzValue value = toFizzBuzzValue.apply(5);

        assertFalse(value.isFizz());
        assertTrue(value.isBuzz());
    }

    @Test
    public void test15IsBothFizzAndBuzz() {
        FizzBuzzValue value = toFizzBuzzValue.apply(15);

        assertTrue(value.isFizz());
        assertTrue(value.isBuzz());
    }
}
