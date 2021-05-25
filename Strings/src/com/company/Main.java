package com.company;

public class Main {

    public static void main(String[] args) {
        // 8 primitive data types in java
        /*
        * byte
        * short
        * int
        * long
        * float
        * double
        * char
        * boolean
        */
        // String is not a primitive datatype in java it is a class
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2021";
        System.out.println("myString is equal to " + myString);
    }
}
