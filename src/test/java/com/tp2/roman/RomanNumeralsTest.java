package com.tp2.roman;

import com.tp2.password.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    // TODO: Replace these lines with your tests
    RomanNumerals number = new RomanNumerals();
    @Test
    void test1ToI() {
        assertEquals("I", number.convert(1));
    }

    @Test
    void test5ToV() {
        assertEquals("V", number.convert(5));
    }

    @Test
    void test10ToX(){
        assertEquals("X", number.convert(10));
    }

    @Test
    void test4toIV(){
        assertEquals("IV", number.convert(4));
    }

    @Test
    void test9ToIX() {
        assertEquals("IX", number.convert(9));
    }

    @Test
    void test40ToXL() {
        assertEquals("XL", number.convert(40));
    }

    @Test
    void test50ToL(){
        assertEquals("L", number.convert(50));
    }

    @Test
    void test90ToXC(){
        assertEquals("XC", number.convert(90));
    }

    @Test
    void test100ToC(){
        assertEquals("C", number.convert(100));
    }

    @Test
    void test400ToCD(){
        assertEquals("CD", number.convert(400));
    }

    @Test
    void test500ToD(){
        assertEquals("D", number.convert(500));
    }

    @Test
    void test900ToCM(){
        assertEquals("CM", number.convert(900));
    }

    @Test
    void test1000ToM(){
        assertEquals("M", number.convert(1000));
    }

    @Test
    void testComplex(){
        assertEquals("MCMXCIV", number.convert(1994));
    }

//    Missing tests:
//
//- Convert 1 to "I"
//- Convert 5 to "V"
//- Convert 10 to "X"
//- Convert 4 to "IV" (subtraction case)
//- Convert 9 to "IX" (subtraction case)
//- Convert 40 to "XL"
//- Convert 50 to "L"
//- Convert 90 to "XC"
//- Convert 100 to "C"
//- Convert 400 to "CD"
//- Convert 500 to "D"
//- Convert 900 to "CM"
//- Convert 1000 to "M"
//- Convert complex numbers like 1994 to "MCMXCIV"
}
