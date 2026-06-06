public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // Deposit
    public void deposit(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit failed: Cannot deposit £" + amount + " (Must be greater than zero).");
        }
        balance += amount;
        System.out.println("💰 Deposited: £" + amount + " | New Balance: £" + balance);
    }

    // Withdrawal
    public void withdraw(double amount) throws InvalidTransactionException, InsufficientFundsException{
        if (amount < 0) {
            throw new InvalidTransactionException("Withdrawal failed: Cannot withdraw £" + amount + " (Must be greater than zero).");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed: Insufficient funds. Available: £" + balance + " | Requested: £" + amount);
        }
        balance -= amount;
        System.out.println("💸 Withdrew: £" + amount + " | Remaining Balance: £" + balance);
    }

    // Displaying the balance
    public double getBalance() {
        return balance;
    }
}
