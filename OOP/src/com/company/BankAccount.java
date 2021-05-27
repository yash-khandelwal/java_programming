package com.company;

public class BankAccount {
//    properties
    private int accountNumber;
    private int balance;
    private String name;
    private String email;
    private String phoneNumber;
//    constructor
    public BankAccount() {
        this(0, 0, "DefaultName", "DefaultEmail", "defaultPhoneNumber");
    }
    public BankAccount(int accountNumber, int balance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
//    setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
//    getters
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
//    functional methods
    public int withdraw(int amount) {
        if(this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("Withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
        return this.balance;
    }
    public int deposit(int amount) {
        this.balance += amount;
        System.out.println("Deposited successfully.");
        return this.balance;
    }
    public void print() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phoneNumber);
        System.out.println("Balance: " + this.balance);
    }
}
