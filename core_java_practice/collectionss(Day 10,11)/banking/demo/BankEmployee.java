package com.banking.demo;

public abstract class BankEmployee {
    protected String name;
    
    public BankEmployee(String name)
    {
    	this.name=name;
    }
    public abstract void assistCustomer(Account account);
    
}
