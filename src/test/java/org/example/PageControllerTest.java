package org.example;

import org.example.pojo.FizzBuzzValue;
import org.example.pojo.Page;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author James Richardson
 */
class PageControllerTest {

    private final PageController pageController = new PageController();
    
    @Test
    public void getPageReturnsFizzBuzzValuesFor1To100() {
        Page page = pageController.getPage();

        List<FizzBuzzValue> values = page.getValues();
        assertNotNull(values);
        assertEquals(100, values.size());
        assertEquals(1, values.get(0).getInteger());
        assertFalse(values.get(0).isFizz());
        assertFalse(values.get(0).isBuzz());
        assertEquals(100, values.get(99).getInteger());
        assertFalse(values.get(99).isFizz());
        assertTrue(values.get(99).isBuzz());
    }
}
