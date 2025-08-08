package wiprodemo;

public class account {
	String name;
	double balance;
	void setAccount(String n, double b)
	{
		name=n;
		balance=b;
		System.out.println("Account created");
	}
	void deposit(double dep)
	{
		balance+=dep;
		System.out.println("Deposited: ₹" + dep);
	}
	void withdrawl(double withd )
	{
		if(withd<=balance)
		{
			balance-=withd;
			System.out.println("withdrawn amount: ₹" + withd);
		}
		System.out.println("insuffecient balance");
		
	}
    void showBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
    public static void main(String[] args) {
        account b = new account();
        b.setAccount("Prakhar", 10000);
        b.deposit(2000);
        b.withdrawl(5000);
        b.withdrawl(9000);
        b.showBalance();
    }
	

}
