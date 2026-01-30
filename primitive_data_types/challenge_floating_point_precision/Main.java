package com.example;

public class Main {
    public static double[] calculateSums() {
     float float_sum=  0.1f+0.2f;
        double double_sum=0.1+0.2;
        
        // Implement the float and double addition here
        return new double[]{float_sum,double_sum};
    }

    public static void main(String[] args) {
        double[] results = calculateSums();
        System.out.println("float result: " + results[0]);
        System.out.println("double result: " + results[1]);
    }
}