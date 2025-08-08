package com.banking.demo;

public class Manager extends BankEmployee {
	public Manager(String name)
	{
		super(name);
	}
	public void assistCustomer(Account account)
	{
		System.out.println("manager "+ name + " assisting " + account.getHolderName());
	}

}
