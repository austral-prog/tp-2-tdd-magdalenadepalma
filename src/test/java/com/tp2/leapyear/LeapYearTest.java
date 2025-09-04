package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    // TODO: Replace these lines with your tests
    @Test
    void testDivisibleByFour(){
        LeapYear year = new LeapYear();
        assertTrue(year.isLeap(2024));
    }

    @Test
    void testDivisibleByAHundred(){
        LeapYear year = new LeapYear();
        assertFalse(year.isLeap(2005));
    }

    @Test
    void testDivisibleByFourHundred(){
        LeapYear year = new LeapYear();
        assertTrue(year.isLeap(2000));
    }
//    Missing tests:
//
//- A year is a leap year if it is divisible by 4
//- A year is not a leap year if it is divisible by 100
//- A year is a leap year if it is divisible by 400
}
