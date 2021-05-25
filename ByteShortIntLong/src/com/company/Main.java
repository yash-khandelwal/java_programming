package com.company;

public class Main {

    public static void main(String[] args) {

        // ranges of different kinds of variables
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("min: " + myMinIntValue + "\nmax: " + myMaxIntValue);
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("min: " + myMinByteValue + "\nmax: " + myMaxByteValue);
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("min: " + myMinShortValue + "\nmax: " + myMaxShortValue);
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("min: " + myMinLongValue + "\nmax: " + myMaxLongValue);

        // datatype casting
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinByteValue / 2);

    }
}
