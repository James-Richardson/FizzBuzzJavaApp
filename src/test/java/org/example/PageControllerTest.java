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
        assertEquals(1, values.get(0).getNumber());
        assertFalse(values.get(0).isFizz());
        assertFalse(values.get(0).isBuzz());
        assertEquals(100, values.get(99).getNumber());
        assertFalse(values.get(99).isFizz());
        assertTrue(values.get(99).isBuzz());
    }

    @Test
    public void getPagePageNum1PageSize100ReturnsFizzBuzzValuesFor101To200() {
        Page page = pageController.getPage(1, 100);

        List<FizzBuzzValue> values = page.getValues();
        assertNotNull(values);
        assertEquals(100, values.size());
        assertEquals(101, values.get(0).getNumber());
        assertFalse(values.get(0).isFizz());
        assertFalse(values.get(0).isBuzz());
        assertEquals(200, values.get(99).getNumber());
        assertFalse(values.get(99).isFizz());
        assertTrue(values.get(99).isBuzz());
    }

    @Test
    public void getPagePageNum1PageSize1000ReturnsFizzBuzzValuesFor1001To2000() {
        Page page = pageController.getPage(1, 1000);

        List<FizzBuzzValue> values = page.getValues();
        assertNotNull(values);
        assertEquals(1000, values.size());
        assertEquals(1001, values.get(0).getNumber());
        assertFalse(values.get(0).isFizz());
        assertFalse(values.get(0).isBuzz());
        assertEquals(2000, values.get(999).getNumber());
        assertFalse(values.get(99).isFizz());
        assertTrue(values.get(99).isBuzz());
    }

    @Test
    public void getPagePageNum9_999_999_999PageSize10ReturnsFizzBuzzValuesFor99_999_999_991To100_000_000_000() {
        Page page = pageController.getPage(9_999_999_999L, 10);

        List<FizzBuzzValue> values = page.getValues();
        assertNotNull(values);
        assertEquals(10, values.size());
        assertEquals(99_999_999_991L, values.get(0).getNumber());
        assertFalse(values.get(0).isFizz());
        assertFalse(values.get(0).isBuzz());
        assertEquals(100_000_000_000L, values.get(9).getNumber());
        assertFalse(values.get(9).isFizz());
        assertTrue(values.get(9).isBuzz());
    }
}
