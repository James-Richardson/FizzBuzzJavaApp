package org.example.pojo;

import java.util.List;

/**
 * @author James Richardson
 */
public class Page {

    private final List<FizzBuzzValue> values;

    public Page(List<FizzBuzzValue> values) {
        this.values = values;
    }

    public List<FizzBuzzValue> getValues() {
        return values;
    }
}
