public class BankAccount {
    String owner;
    private double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount < balance && amount > 0){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: £" + balance);
    }
}
