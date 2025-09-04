package com.tp2.stringcalculator;

import com.tp2.password.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    // TODO: Replace these lines with your tests
    StringCalculator numeros = new StringCalculator();
    @Test
    void testEmptyString(){
        assertEquals(0, numeros.add(""));
    }

    @Test
    void testSingleNumber(){
        assertEquals(5, numeros.add("5"));
    }

    @Test
    void testDosNumeros(){
        assertEquals(8, numeros.add("5, 3"));
    }

    @Test
    void testMultiplesNumeros(){
        assertEquals(6, numeros.add("1, 2, 3"));
    }

    @Test
    void testNewline(){
        assertEquals(6, numeros.add( "1\n2\n3"));
    }

    @Test
    void testNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            numeros.add("-1,2,3");
        });
    }
//    Missing tests:
//
//- Empty string should return 0
//- Single number should return that number
//- Two numbers separated by comma should return their sum
//- Multiple numbers separated by comma should return their sum
//- Numbers separated by newline should work as delimiter
//- Negative numbers should throw IllegalArgumentException
}
