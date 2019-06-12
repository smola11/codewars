package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheParityOutlierTest {

    @Test
    public void when2Even1OddThenReturnOdd(){
        assertEquals(12, FindTheParityOutlier.find(new int[]{12, 3, 9}));
    }

    @Test
    public void when2Odd1EvenThenReturnEven(){
        assertEquals(9, FindTheParityOutlier.find(new int[]{12, 9, 10}));
    }

}