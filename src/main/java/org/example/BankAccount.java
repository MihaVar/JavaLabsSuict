package org.example;

import java.text.MessageFormat;

public class BankAccount {

    private int accountNumber;
    private String accountName;
    private double balance;

    public BankAccount( String accountName, double balance){
        this.accountName = accountName;
        this.balance = balance;
    }

    public double deposit(double amount) throws NegativeAmountException {
        if (amount < 0.0d) {
            throw new NegativeAmountException("Negative amount");
        }
        balance += amount;
        return amount;
    }

    public double withdraw(double amount) throws NegativeAmountException, InsufficientFundsException {
        if (amount < 0.0d) {
            throw new NegativeAmountException("Negative amount");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;
        return amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccountSummary(){
        return MessageFormat.format("Account number: {0}, Account name: {1}, Balance: " + balance, accountNumber, accountName);
    }

    public void setNumber(int number) {
        this.accountNumber = number;
    }

    public int getNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }
}