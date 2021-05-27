package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your Name?");
//        String name = scanner.nextLine();
//        System.out.println(greet(name));
//        System.out.println("What is your CGPA?");
//        double cgpa = scanner.nextDouble();
//        System.out.println("percentage : " + cgpaToPercent(cgpa) + "%");
//        exercise74();
        exercise75();
        scanner.close();
    }

    public static String greet(String name) {
        return "Good Afternoon, " + name;
    }

    public static double cgpaToPercent(double cgpa) {
        return cgpa * 9.5;
    }

    public static void exercise74() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean allCool = true;
        for(int i = 1; i <= 10; i++) {
            System.out.println("Enter the Integer Number #" + i);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int x = scanner.nextInt();
                sum += x;
            } else {
                System.out.println("You Entered Invalid Input :(");
                allCool = false;
                break;
            }
        }
        if(allCool) {
            System.out.println("Sum of numbers = " + sum);
        } else {
            System.out.println("Operation Aborted!");
        }
        scanner.close();
    }

    public static void exercise75() {
        Scanner scanner = new Scanner(System.in);
        boolean allCool = true;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i = 1; i <= 10; i++) {
            System.out.println("Enter the Integer Number #" + i);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int x = scanner.nextInt();
                mini = Math.min(mini, x);
                maxi = Math.max(maxi, x);
            } else {
                System.out.println("You Entered Invalid Input :(");
                allCool = false;
                break;
            }
        }
        if(allCool) {
            System.out.println("minimum value = " + mini);
            System.out.println("maximum value = " + maxi);
        } else {
            System.out.println("Operation Aborted!");
        }
        scanner.close();
    }

}
