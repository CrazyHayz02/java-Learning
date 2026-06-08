import java.io.*;
import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses;
    private final String FILE_NAME = "expenses.txt";

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
        loadExpenses();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense added successfully!");
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
            return;
        }
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }

    // Part 5: Save function (Writes Comma-Separated Values)
    public void saveExpenses() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (Expense e : expenses) {
                writer.write(e.getDescription() + "," + e.getAmount() + "," + e.getCategory() + "\n");
            }
            System.out.println("Expenses saved to disk.");
        } catch (IOException e) {
            System.out.println("Error saving expenses: " + e.getMessage());
        }
    }

    // Part 6: Load function (Parses the CSV back into Objects)
    private void loadExpenses() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return; // Skip if no saved file exists yet

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String description = parts[0];
                    double amount = Double.parseDouble(parts[1]);
                    String category = parts[2];
                    expenses.add(new Expense(description, amount, category));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading expenses: " + e.getMessage());
        }
    }
}