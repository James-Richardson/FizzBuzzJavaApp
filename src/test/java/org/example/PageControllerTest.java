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
    public void getPagePageNum0PageSize100ReturnsFizzBuzzValuesFor1To100() {
        Page page = pageController.getPage(0, 100);

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

    @Test
    public void getPagePageNum1PageSize100ReturnsFizzBuzzValuesFor101To200() {
        Page page = pageController.getPage(1, 100);

        List<FizzBuzzValue> values = page.getValues();
        assertNotNull(values);
        assertEquals(100, values.size());
        assertEquals(101, values.get(0).getInteger());
        assertFalse(values.get(0).isFizz());
        assertFalse(values.get(0).isBuzz());
        assertEquals(200, values.get(99).getInteger());
        assertFalse(values.get(99).isFizz());
        assertTrue(values.get(99).isBuzz());
    }

    @Test
    public void getPagePageNum1PageSize1000ReturnsFizzBuzzValuesFor1001To2000() {
        Page page = pageController.getPage(1, 1000);

        List<FizzBuzzValue> values = page.getValues();
        assertNotNull(values);
        assertEquals(1000, values.size());
        assertEquals(1001, values.get(0).getInteger());
        assertFalse(values.get(0).isFizz());
        assertFalse(values.get(0).isBuzz());
        assertEquals(2000, values.get(999).getInteger());
        assertFalse(values.get(99).isFizz());
        assertTrue(values.get(99).isBuzz());
    }
}
