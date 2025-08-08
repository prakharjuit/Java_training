package com.banking.demo;

public interface BankService {
     void createAccount(Account Account);
     void deposit(String accountNumber, double amount);
     void withdraw(String accountNumber, double amount);
     void showAccountDetails(String accountNumber);
}
