package com.tp2.stringcalculator;

public class StringCalculator {
    
    public int add(String numbers) {
        // TODO: Implement the add method following TDD approach
        // Start with the simplest case and build incrementally
        int sum = 0;
        if (numbers.length() == 0){
            return sum;
        }
        numbers = numbers.replace("\n", ",");
        String[] parts = numbers.split(",");

        for (int i = 0; i < parts.length; i++) {
            int num = Integer.parseInt(parts[i].trim());
            if (num < 0) {
                throw new IllegalArgumentException("Negatives not allowed: " + num);
            }
            sum += num;
        }

        return sum;
    }
}
