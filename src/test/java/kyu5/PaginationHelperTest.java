package kyu5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaginationHelperTest {

    private PaginationHelper<Character> helper1 = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
    private PaginationHelper<Character> helper2 = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 6);
    private PaginationHelper<Character> helper3 = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 3);

    @Test
    void pageCount() {
        assertEquals(2, helper1.pageCount()); // Number of pages
        assertEquals(1, helper2.pageCount());
        assertEquals(2, helper3.pageCount());
    }

    @Test
    void itemCount() {
        assertEquals(6, helper1.itemCount()); // Number of items
    }

    @Test
    void pageItemCountCase1() {
        PaginationHelper<Character> helper4 = new PaginationHelper<>(Arrays.asList('a', 'b'), 8);
        assertEquals(2, helper4.pageItemCount(0)); // Number of items in specified page
    }

    @Test
    void pageItemCountCase2() {
        assertEquals(4, helper1.pageItemCount(0)); // Number of items in specified page
        assertEquals(2, helper1.pageItemCount(1));
    }

    @Test
    void pageItemCountInvalidPage() {
        assertEquals(-1, helper1.pageItemCount(2)); // should == -1 since the page is invalid
        assertEquals(-1, helper1.pageItemCount(-1));
        assertEquals(-1, helper1.pageItemCount(3));
    }

    // pageIndex takes an item index and returns the page that it belongs on
    @Test
    void pageIndex() {
        assertEquals(1, helper1.pageIndex(5));
        assertEquals(0, helper1.pageIndex(2));
        assertEquals(0, helper2.pageIndex(0));
        assertEquals(0, helper2.pageIndex(3));
        assertEquals(0, helper2.pageIndex(5));
    }

    @Test
    void pageIndexInvalid() {
        assertEquals(-1, helper1.pageIndex(20));
        assertEquals(-1, helper1.pageIndex(-10));
    }
}