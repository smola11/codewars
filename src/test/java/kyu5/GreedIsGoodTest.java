package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreedIsGoodTest {

    @Test
    void first() {
        assertEquals(250, GreedIsGood.greedy(new int[]{5, 1, 3, 4, 1}));
    }

    @Test
    void second() {
        assertEquals(1100, GreedIsGood.greedy(new int[]{1, 1, 1, 3, 1}));
    }

    @Test
    void third() {
        assertEquals(450, GreedIsGood.greedy(new int[]{2, 4, 4, 5, 4}));
    }

}