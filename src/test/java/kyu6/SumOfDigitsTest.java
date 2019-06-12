package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SumOfDigitsTest {

    @Test
    public void whenTwoDigitNumberReturnItsSum() {
        assertEquals(7, SumOfDigits.digital_root(16));
    }

    @Test
    public void whenSumOfDigitsMoreThan9RepeatAction() {
        assertEquals(6, SumOfDigits.digital_root(456));
    }


}