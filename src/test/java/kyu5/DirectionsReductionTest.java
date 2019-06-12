package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionsReductionTest {

    @Test
    public void whenWestEastReturnEmpty(){
        assertArrayEquals(new String[]{}, DirectionsReduction.dirReduc(new String[]{"EAST", "WEST"}));
    }

    @Test
    public void whenNorthSouthReturnEmpty(){
        assertArrayEquals(new String[]{}, DirectionsReduction.dirReduc(new String[]{"SOUTH", "NORTH"}));
    }

}