package com.banking.demo;
import java.util.HashMap;
public class BankServiceImpl implements BankService {
	private HashMap<String,Account> accounts = new HashMap<>();
	
//    public Account getAccount(String accountNumber) {
//        return accounts.get(accountNumber);
//    }
        public void createAccount(Account account) {
            accounts.put(account.getAccountNumber(), account);
            System.out.println("Account created for: " + account.getHolderName());
        }
        public void deposit(String accountNumber, double amount) {
            Account acc = accounts.get(accountNumber);
            if (acc != null) {
                acc.setBalance(acc.getBalance() + amount);
                System.out.println("₹" + amount + " deposited to " + accountNumber);
                System.out.println(" updated balance:₹ " + acc.getBalance());
            } else {
                System.out.println("Account not found.");
            }
        }
        public void withdraw(String accountNumber, double amount) {
            Account acc = accounts.get(accountNumber);
            if (acc != null) {
                if (acc.getBalance() >= amount) {
                    acc.setBalance(acc.getBalance() - amount);
                    System.out.println("₹" + amount + " withdrawn from " + accountNumber);
                    System.out.println(" updated balance:₹ " + acc.getBalance());
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Account not found.");
            }
        }

        public void showAccountDetails(String accountNumber) {
            Account acc = accounts.get(accountNumber);
            if (acc != null) {
                System.out.println("Account No: " + acc.getAccountNumber());
                System.out.println("Holder Name: " + acc.getHolderName());
                System.out.println("Balance: ₹" + acc.getBalance());
            } else {
                System.out.println("Account not found.");
            }
        }
        
}
