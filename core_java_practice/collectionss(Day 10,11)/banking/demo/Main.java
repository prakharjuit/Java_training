package com.banking.demo;
//import java.utils.scanner;
public class Main {
public static void main(String [] args)
{
	Account a1=new Account("121212","Prakhar",50000);
	BankService s1=new  BankServiceImpl();
	s1.createAccount(a1);
	s1.showAccountDetails("121212");
	s1.deposit("121212", 10000);
	s1.withdraw("121212",10000);
	Manager m1 = new Manager("ABC");
	m1.assistCustomer(a1);
}
}
