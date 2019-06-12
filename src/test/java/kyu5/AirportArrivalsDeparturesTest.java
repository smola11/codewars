package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportArrivalsDeparturesTest {

    @Test
    public void test1() {
        assertArrayEquals(new String[]{"DOG"}, AirportArrivalsDepartures.flapDisplay(new String[]{"CAT"}, new int[][]{{1, 13, 27}}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new String[]{"WORLD!"}, AirportArrivalsDepartures.flapDisplay(new String[]{"HELLO "}, new int[][]{{15,49,50,48,43,13}}));
    }


}