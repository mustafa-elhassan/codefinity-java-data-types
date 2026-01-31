package com.example;

public class Main {

    public static void safeDoubleToInt(double value) {
        // Print the original double value
        System.out.println("Original double value: " + value);

        intValue = (int) value;

        // Print the converted int value
        System.out.println("Converted int value: " + intValue);

        // Print warning only if there was data loss
        if (value != intValue) {
            System.out.println("Warning: Data loss occurred during conversion.");
        }
    }

    public static void main(String[] args) {
        safeDoubleToInt(42.7); // fractional
        safeDoubleToInt(42.0); // whole number
    }
}