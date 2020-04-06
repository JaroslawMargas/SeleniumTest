package org.example.lesson09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStringTest {

    @Test
    void checkOrderTest() {
        assertTrue(OrderString.checkOrder("vwxyz"));
    }
    @Test
    void checkOrderFiledTest() {
        assertFalse(OrderString.checkOrder("abd"));
    }

    @Test
    void checkOrderSpaceTest() {
        assertTrue(OrderString.checkOrder(" "));
    }
}