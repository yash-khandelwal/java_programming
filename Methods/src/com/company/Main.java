package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = scanner.nextLine();
        System.out.println(greet(name));
        System.out.println("percentage : " + cgpaToPercent(8.39) + "%");
        scanner.close();
    }

    public static String greet(String name) {
        return "Good Afternoon, " + name;
    }

    public static double cgpaToPercent(double cgpa) {
        return cgpa * 9.5;
    }



}
