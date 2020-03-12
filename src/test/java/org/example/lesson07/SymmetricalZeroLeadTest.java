package org.example.lesson07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricalZeroLeadTest {

    @Test
    void checkSymmetricalZeroLeftTest() {
        assertTrue(Conditional.checkSymmetricalZeroLeft(1001,4));
        assertTrue(Conditional.checkSymmetricalZeroLeft(110,4));
        assertTrue(Conditional.checkSymmetricalZeroLeft(0,4));
    }
    @Test
    void checkNoSymmetricalZeroLeftTest() {
        assertFalse(Conditional.checkSymmetricalZeroLeft(1,4));
        assertFalse(Conditional.checkSymmetricalZeroLeft(12,4));
        assertFalse(Conditional.checkSymmetricalZeroLeft(123,4));
        assertFalse(Conditional.checkSymmetricalZeroLeft(1234,4));
    }
}