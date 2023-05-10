
public class BankAccount {
	
	private String ownerName;
    private String accountNumber;
    private double balance;

    public BankAccount(String ownerName, String accountNumber, double initialBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        if (initialBalance < 50000) {
            this.balance = 50000;
        } 
        else {
            this.balance = initialBalance;
        }
    }

	public String getOwnerName() {
		return ownerName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
    
	public void deposit(double amount) {
	    if (amount > 0) {
	        balance += amount;
	    } 
	    else {
	        System.out.println("Invalid amount");
	    }
	}
	
	public void withdraw(double amount) {
        if (amount > 0) {
        	if (balance - amount < 55000) {
                System.out.println("Insufficient balance");
            } 
        	else {
                balance -= (amount + 5000);
            }
        }
        else {
	        System.out.println("Invalid amount");
	    }
    }
}


