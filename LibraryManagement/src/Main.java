import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n======== LIBRARY MANAGEMENT SYSTEM ========");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Books");
            System.out.println("6. View Catalog");
            System.out.println("7. Save Catalog");
            System.out.println("8. Save & Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\n");

            switch (choice) {
                case 1:
                    System.out.print("Enter unique Book ID (Integer): ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    if (title.trim().isEmpty() || author.trim().isEmpty()) {
                        System.out.println("❌ Error: Title and Author cannot be empty!");
                    } else {
                        library.addBook(new Book(id, title, author, true));
                    }
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = scanner.nextInt();
                    library.removeBook(removeId);
                    break;

                case 3:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = scanner.nextInt();
                    library.borrowBook(borrowId);
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;

                case 5:
                    System.out.print("Enter keywords to search (Title or Author): ");
                    String search = scanner.nextLine();
                    library.searchBooks(search);
                    break;

                case 6:
                    System.out.println("--- Current Library Books ---");
                    library.viewBooks();
                    break;

                case 7:
                    library.saveBooks();
                    break;

                case 8:
                    library.saveBooks();
                    running = false;
                    System.out.println("System shutting down. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Select 1 to 8.");
            }
        }
        scanner.close();
    }
}