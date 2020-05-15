package org.example;

import org.example.pojo.FizzBuzzValue;
import org.example.pojo.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.rangeClosed;
import static org.example.FizzBuzz.toFizzBuzzValue;

/**
 * @author James Richardson
 */
@RestController
public class PageController {

    @GetMapping("/page")
    public Page getPage() {
        List<FizzBuzzValue> values = rangeClosed(1, 100).mapToObj(toFizzBuzzValue).collect(toList());

        return new Page(values);
    }
}
