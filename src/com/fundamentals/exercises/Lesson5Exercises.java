package com.fundamentals.exercises;

public class Lesson5Exercises {

    // Prints the number 29 in different number systems
    public void printNum(){

        // Decimal
        System.out.println("29");

        // Hexadecimal
        System.out.println("0x1D");

        // Binary
        System.out.println("0B11101");
    }

    // Preforms Widening Conversions and prints results
    public void wideningConversion(){
        byte val1 = 1;
        short val2 = 2;
        int val3 = 3;

        // byte to int
        int ex1 = val1;

        // short to long
        long ex2 = val2;

        // int to float
        float ex3 = val3;

        // results

        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
    }

    // Preforms Narrowing Conversions and prints results
    public void narrowingConversions(){

        double val1 = 25.25;
        float val2 = 8795.92344F;
        long val3 = 9876543210L;

        // double to long
        long ex1 = (long)val1;

        // float to int
        int ex2 = (int)val2;

        // long to short
        short ex3 = (short)val3;

        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
    }

}
