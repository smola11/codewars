package kyu4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextBiggerNumberWithTheSameDigitsTest {

    @Test
    void findMostSimilar1() {
        assertEquals(21, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(12));
    }

    @Test
    void findMostSimilar2() {
        assertEquals(531, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(513));

    }

    @Test
    void findMostSimilar3() {
        assertEquals(2071, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(2017));
    }

    @Test
    void findMostSimilar4() {
        assertEquals(441, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(414));
    }

    @Test
    void findMostSimilar5() {
        assertEquals(414, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(144));
    }

    @Test
    void findMostSimilar6() {
        assertEquals(779575219, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(779575192));
    }


}