package org.example;

import org.example.pojo.FizzBuzzValue;
import org.example.pojo.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.rangeClosed;
import static org.example.FizzBuzz.toFizzBuzzValue;

/**
 * @author James Richardson
 */
@RestController
public class PageController {

    @GetMapping("/getPage")
    public Page getPage(
            @RequestParam(value = "pageNum", defaultValue = "0") int pageNum,
            @RequestParam(value = "pageSize", defaultValue = "100") int pageSize) {
        int startInclusive = 1 + (pageNum * pageSize);
        int endInclusive = (1 + pageNum) * pageSize;
        List<FizzBuzzValue> values
                = rangeClosed(startInclusive, endInclusive)
                .mapToObj(toFizzBuzzValue)
                .collect(toList());

        return new Page(values);
    }
}
