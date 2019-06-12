package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleColaTest {

    @Test
    public void whenNamesInQueueReturnWhoIsSecond() {
        assertEquals("b", DoubleCola.whoIsNext(new String[]{"a", "b"}, 2));

    }

    @Test
    public void whenNamesInQueueReturnWhoIsThird() {
        assertEquals("a", DoubleCola.whoIsNext(new String[]{"a", "b"}, 3));

    }

    @Test
    public void whenNamesInQueueReturnWhoIs6() {
        assertEquals("b", DoubleCola.whoIsNext(new String[]{"a", "b"}, 6));

    }

    @Test
    public void codeWarsTest() {
        assertEquals("Sheldon", DoubleCola.whoIsNext(new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" }, 6));

    }
}