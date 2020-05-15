package org.example.pojo;

/**
 * @author James Richardson
 */
public class FizzBuzzValue {

    private final int integer;
    private final boolean fizz;
    private final boolean buzz;

    public FizzBuzzValue(int integer, boolean fizz, boolean buzz) {
        this.integer = integer;
        this.fizz = fizz;
        this.buzz = buzz;
    }

    public int getInteger() {
        return integer;
    }

    public boolean isFizz() {
        return fizz;
    }

    public boolean isBuzz() {
        return buzz;
    }
}
