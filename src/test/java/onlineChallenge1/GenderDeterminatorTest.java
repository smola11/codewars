package onlineChallenge1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenderDeterminatorTest {

    @Test
    public void test1() {
        assertEquals("F", new GenderDeterminator().determineGender(Arrays.asList("f", "f"), "U"));
    }

    @Test
    public void test2() {
        assertEquals("M", new GenderDeterminator().determineGender(Arrays.asList("m", "m"), "U"));
    }

    @Test
    public void test3() {
        assertEquals("M", new GenderDeterminator().determineGender(Arrays.asList("M", "M"), "U"));
    }

    @Test
    public void test4() {
        assertEquals("F", new GenderDeterminator().determineGender(Arrays.asList("F", "F"), "U"));
    }

    @Test
    public void test5() {
        assertEquals("U", new GenderDeterminator().determineGender(Arrays.asList("m", "f"), "U"));
    }

    @Test
    public void test6() {
        assertEquals("U", new GenderDeterminator().determineGender(Arrays.asList("f", "m"), "U"));
    }

    @Test
    public void test7() {
        assertEquals("U", new GenderDeterminator().determineGender(Arrays.asList("F", "M"), "U"));
    }

    @Test
    public void test8() {
        assertEquals("U", new GenderDeterminator().determineGender(Arrays.asList("M", "F"), "U"));
    }

    @Test
    public void test9() {
        assertEquals("M", new GenderDeterminator().determineGender(Arrays.asList("M", "f"), "U"));
    }

    @Test
    public void test10() {
        assertEquals("M", new GenderDeterminator().determineGender(Arrays.asList("f", "M"), "U"));
    }

    @Test
    public void test11() {
        assertEquals("F", new GenderDeterminator().determineGender(Arrays.asList("F", "m"), "U"));
    }

    @Test
    public void test12() {
        assertEquals("F", new GenderDeterminator().determineGender(Arrays.asList("m", "F"), "U"));
    }

    @Test
    public void test13() {
        assertEquals("M", new GenderDeterminator().determineGender(Arrays.asList("m", "m", "m"), "U"));
    }

    @Test
    public void test14() {
        assertEquals("F", new GenderDeterminator().determineGender(Arrays.asList("f", "f", "f"), "U"));
    }

    @Test
    public void test15() {
        assertEquals("U", new GenderDeterminator().determineGender(Arrays.asList("m", "m", "f"), "U"));
    }

    @Test
    public void test16() {
        assertEquals("U", new GenderDeterminator().determineGender(Arrays.asList("m", "f", "f"), "U"));
    }

    @Test
    public void test17() {
        assertEquals("U", new GenderDeterminator().determineGender(Arrays.asList("f", "m", "f"), "U"));
    }

    @Test
    public void test18() {
        assertEquals("U", new GenderDeterminator().determineGender(Arrays.asList("f", "f", "m"), "U"));
    }

    @Test
    public void test19() {
        assertEquals("F", new GenderDeterminator().determineGender(Arrays.asList("F", "f", "m"), "U"));
    }

    @Test
    public void test20() {
        assertEquals("F", new GenderDeterminator().determineGender(Arrays.asList("m", "F", "m"), "U"));
    }

    @Test
    public void test21() {
        assertEquals("F", new GenderDeterminator().determineGender(Arrays.asList("m", "m", "F"), "U"));
    }

    @Test
    public void test22() {
        assertEquals("F", new GenderDeterminator().determineGender(Arrays.asList("m", "f", "F"), "U"));
    }

    @Test
    public void test23() {
        assertEquals("F", new GenderDeterminator().determineGender(Arrays.asList("F", "f", "F"), "U"));
    }

    @Test
    public void test24() {
        assertEquals("U", new GenderDeterminator().determineGender(Arrays.asList("m", "M", "F"), "U"));
    }

    @Test
    public void test25() {
        assertEquals("M", new GenderDeterminator().determineGender(Arrays.asList("m", "U"), "U"));
    }

    @Test
    public void test26() {
        assertEquals("U", new GenderDeterminator().determineGender(Collections.singletonList("U"), "U"));
    }

    @Test
    public void test27() {
        assertEquals("M", new GenderDeterminator().determineGender(Arrays.asList("M", "U"), "U"));
    }

    @Test
    public void test28() {
        assertEquals("F", new GenderDeterminator().determineGender(Arrays.asList("U", "f"), "U"));
    }

    @Test
    public void test29() {
        assertEquals("M", new GenderDeterminator().determineGender(Arrays.asList("M", "f", "F"), "U"));
    }

    @Test
    public void test30() {
        assertEquals("M", new GenderDeterminator().determineGender(Arrays.asList("f", "m", "M"), "U"));
    }

}