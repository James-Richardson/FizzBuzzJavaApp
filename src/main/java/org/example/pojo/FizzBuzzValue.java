package org.example.pojo;

/**
 * @author James Richardson
 */
public class FizzBuzzValue {

    private final long number;
    private final boolean fizz;
    private final boolean buzz;

    public FizzBuzzValue(long number, boolean fizz, boolean buzz) {
        this.number = number;
        this.fizz = fizz;
        this.buzz = buzz;
    }

    public long getNumber() {
        return number;
    }

    public boolean isFizz() {
        return fizz;
    }

    public boolean isBuzz() {
        return buzz;
    }
}
