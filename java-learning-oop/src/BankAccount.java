public class BankAccount {
    String owner;
    private double balance;

    // Deposit
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdrawal
    void withdraw(double amount) {
        if (amount < balance && amount > 0){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Displaying the balance
    void showBalance() {
        System.out.println("Current Balance: £" + balance);
    }
}
