import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("☕ Java Exception Handling Learning Day");
        System.out.println("=========================================");
        System.out.println("1️⃣ Basic Runtime Exceptions");
        System.out.println("2️⃣ Interactive Banking System");
        System.out.print("\nChoose an option to run (1 or 2): ");

        if (!scanner.hasNextInt()) {
            System.out.println("🛑 Invalid menu input. Program closing.");
            scanner.close();
            return;
        }

        int choice = scanner.nextInt();
        scanner.nextLine(); // 🔥 FIX: This eats the leftover 'Enter' key so the name entry waits!
        System.out.println("-----------------------------------------\n");

        switch (choice) {
            case 1:
                runTask1();
                break;
            case 2:
                runInteractiveBank(scanner);
                break;
            default:
                System.out.println("❌ Invalid choice. Please restart and select 1 or 2.");
        }

        scanner.close();
        System.out.println("\n-----------------------------------------");
        System.out.println("🔌 Resources released. Program finished smoothly.");
    }


    private static void runTask1() {
        System.out.println("--- Handling Common Crashing Scenarios ---");

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("✔ Caught ArithmeticException: You cannot divide by zero.");
        }

        try {
            String name = null;
            name.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("✔ Caught NullPointerException: Object points to nothing (null).");
        }

        try {
            int[] numbers = {1, 2, 3};
            int brokenIndex = numbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("✔ Caught ArrayIndexOutOfBoundsException: Attempted to read index " + e.getMessage());
        }
    }

    private static void runInteractiveBank(Scanner scanner) {
        System.out.println("--- Setup New Bank Account ---");

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        double startingBalance = 0;
        System.out.print("Enter starting balance: £");
        if (!scanner.hasNextDouble()) {
            System.out.println("🛑 Critical Error: Balance must be a clean numeric amount.");
            scanner.nextLine();
            return;
        }
        startingBalance = scanner.nextDouble();
        scanner.nextLine();

        BankAccount account = new BankAccount(name, startingBalance);
        System.out.println("\n✅ Account opened successfully for " + name + "!");


        boolean running = true;
        while (running) {
            System.out.println("\n-----------------------------------------");
            System.out.println("🏦 --- ATM MAIN MENU ---");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit ATM");
            System.out.print("Choose an action (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("❌ Invalid choice format. Please input a number (1-4).");
                scanner.nextLine();
                continue;
            }

            int action = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            System.out.println("-----------------------------------------");

            switch (action) {
                case 1:
                    // Show Balance
                    System.out.println("💳 Account Holder: " + name);
                    System.out.println("💰 Current Available Balance: £" + account.getBalance());
                    break;

                case 2:
                    // Deposit Money
                    try {
                        System.out.print("Enter amount to deposit: £");
                        if (!scanner.hasNextDouble()) {
                            System.out.println("❌ Error: Input must be a number.");
                            scanner.nextLine();
                            break;
                        }
                        double depAmount = scanner.nextDouble();
                        scanner.nextLine();

                        account.deposit(depAmount);
                    } catch (InvalidTransactionException e) {
                        System.out.println("❌ Transaction Blocked: " + e.getMessage());
                    }
                    break;

                case 3:
                    // Withdraw Money
                    try {
                        System.out.print("Enter amount to withdraw: £");
                        if (!scanner.hasNextDouble()) {
                            System.out.println("❌ Error: Input must be a number.");
                            scanner.nextLine();
                            break;
                        }
                        double withAmount = scanner.nextDouble();
                        scanner.nextLine();

                        account.withdraw(withAmount);
                    } catch (InsufficientFundsException | InvalidTransactionException e) {
                        System.out.println("❌ Transaction Blocked: " + e.getMessage());
                    }
                    break;

                case 4:
                    // Exit Loop
                    System.out.println("👋 Thank you for banking with us. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("❌ Selection out of bounds. Choose 1, 2, 3, or 4.");
            }
        }
    }
}