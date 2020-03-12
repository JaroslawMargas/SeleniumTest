package org.example.lesson07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapTest {

    @Test
    void checkLeapYear() {
        assertEquals("Leap", Conditional.checkLeapYear(2000));
    }
    @Test
    void checkRegularYear(){
        assertEquals("Regular", Conditional.checkLeapYear(2100));
    }
}