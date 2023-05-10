public class SavingAccount extends BankAccount {
    private double annualInterestRate;

    public SavingAccount(String ownerName, String accountNumber, double initialBalance, double annualInterestRate) {
        super(ownerName, accountNumber, initialBalance);
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double calculateMonthlyInterest() {
        return getBalance() * annualInterestRate / 12;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Sorry, withdrawals are not allowed from a savings account");
    }
}