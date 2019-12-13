package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindTheSmallestTest {

    @Test
    void first() {
        assertArrayEquals(new long[]{126235, 2, 0}, FindTheSmallest.smallest(261235));
    }

    @Test
    void second() {
        assertArrayEquals(new long[]{29917, 0, 1}, FindTheSmallest.smallest(209917));
    }

    @Test
    void third() {
        assertArrayEquals(new long[]{1, 0, 6}, FindTheSmallest.smallest(1000000));
    }

}