package wiprodemo;
import java.util.Scanner;
class InvalidException extends Exception
{
	public InvalidException(String message)
	{
		super(message);
	}
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class Account {
    int accNum;
    int pin;
    double balance;

    public Account(int accNum, int pin, double balance) {
        this.accNum = accNum;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePin(int inputPin) throws InvalidException {
        if (this.pin != inputPin) {
            throw new InvalidException("Invalid PIN.");
        }
        return true;
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account user = new Account(1001, 1212, 5000); 

        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        boolean authenticated = false;

        while (attempts < MAX_ATTEMPTS && !authenticated) {
            try {
                System.out.println("Insert ATM card...");
                System.out.print("Enter your PIN: ");
                int inputPin = sc.nextInt();

                user.validatePin(inputPin);
                System.out.println("PIN verified.");
                authenticated = true;

                int choice;
                do {
                    System.out.println("\nMenu:");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            user.checkBalance();
                            break;
                        case 2:
                            System.out.print("Enter amount to withdraw: ₹");
                            double withdrawAmt = sc.nextDouble();
                            try {
                                user.withdraw(withdrawAmt);
                            } catch (InsufficientBalanceException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;
                        case 3:
                            System.out.print("Enter amount to deposit: ₹");
                            double depositAmt = sc.nextDouble();
                            user.deposit(depositAmt);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                } while (choice != 4); 

            } catch (InvalidException e) {
                attempts++;
                System.out.println("Access denied: " + e.getMessage());
                System.out.println("Attempts left: " + (MAX_ATTEMPTS - attempts));
            } finally {
                System.out.println("Transaction session ended. Remove your card or retry.");
            }
        }

        if (!authenticated) {
            System.out.println("Too many incorrect attempts. Card blocked.");
        }

        sc.close();
   }
}
