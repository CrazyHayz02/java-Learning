import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n======== EXPENSE TRACKER ========");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total Spend");
            System.out.println("4. Save & Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character left behind by nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter description: ");
                    String desc = scanner.nextLine();
                    System.out.print("Enter amount (£): ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter category (Food, Transport, Bills, etc.): ");
                    String category = scanner.nextLine();

                    manager.addExpense(new Expense(desc, amount, category));
                    break;
                case 2:
                    System.out.println("\n--- Current Expenses ---");
                    manager.viewExpenses();
                    break;
                case 3:
                    System.out.printf("\nTotal Expenses: £%.2f\n", manager.calculateTotal());
                    break;
                case 4:
                    manager.saveExpenses();
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        }
        scanner.close();
    }
}