package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setDoors(4);
//        porsche.print();
//        BankAccount account = new BankAccount(17145, 0, "Kritagya Khandelwal", "17145@iiitu.ac.in", "8178638856");
        BankAccount account = new BankAccount();
//        account.setAccountNumber(17145);
//        account.setBalance(0);
//        account.setEmail("17145@iiitu.ac.in");
//        account.setPhoneNumber("8178638856");
//        account.setName("Kritagya Khandelwal");
        System.out.println("Start transactions: ");
        System.out.println("For deposit input: 1 amount");
        System.out.println("For withdrawal input: 2 amount");
        System.out.println("To End transactions input: 0");
        while(true) {
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int transactionType = scanner.nextInt();
                if(transactionType == 0) {
                    break;
                }
                int amount;
                if(scanner.hasNextInt()) {
                    amount = scanner.nextInt();
                } else {
                    System.out.println("Invalid Input");
                    break;
                }
                int newBalance;
                if(transactionType == 1) {
                    newBalance = account.deposit(amount);
                } else {
                    newBalance = account.withdraw(amount);
                }
                System.out.println("Balance = " + newBalance);
            } else {
                System.out.println("Invalid Input");
                break;
            }
        }
        account.print();
        scanner.close();
    }
}
