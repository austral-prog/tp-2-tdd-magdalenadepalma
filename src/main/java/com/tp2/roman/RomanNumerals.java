package com.tp2.roman;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
    
    public String convert(int number) {
        // TODO: Implement roman numeral conversion following TDD approach
        // Start with basic numbers: 1=I, 5=V, 10=X
        // Then handle subtraction cases: 4=IV, 9=IX
        // Build up to complex numbers like 1994=MCMXCIV
        // lista de valores
        List<Integer> values = new ArrayList<>();
        values.add(1000);
        values.add(900);
        values.add(500);
        values.add(400);
        values.add(100);
        values.add(90);
        values.add(50);
        values.add(40);
        values.add(10);
        values.add(9);
        values.add(5);
        values.add(4);
        values.add(1);

        // lista de simbolos romanos
        List<String> symbols = new ArrayList<>();
        symbols.add("M");
        symbols.add("CM");
        symbols.add("D");
        symbols.add("CD");
        symbols.add("C");
        symbols.add("XC");
        symbols.add("L");
        symbols.add("XL");
        symbols.add("X");
        symbols.add("IX");
        symbols.add("V");
        symbols.add("IV");
        symbols.add("I");

        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < values.size(); i++) {
            while (number >= values.get(i)) {
                number -= values.get(i);
                resultList.add(symbols.get(i));
            }
        }

        String result = "";
        for (int i = 0; i < resultList.size(); i++) {
            result = result + resultList.get(i); // concatenación simple
        }

        return result;
    }
}
