package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhatAPerfectPowerTest {

    @Test
    public void test0() {
        assertNull(WhatAPerfectPower.isPerfectPower(0));
    }

    @Test
    public void test1() {
        assertNull(WhatAPerfectPower.isPerfectPower(1));
    }

    @Test
    public void test2() {
        assertNull(WhatAPerfectPower.isPerfectPower(2));
    }

    @Test
    public void test3() {
        assertNull(WhatAPerfectPower.isPerfectPower(3));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{2, 2}, WhatAPerfectPower.isPerfectPower(4));
    }

    @Test
    public void test8() {
        assertArrayEquals(new int[]{2, 3}, WhatAPerfectPower.isPerfectPower(8));
    }

}