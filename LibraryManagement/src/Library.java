import java.io.*;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private final String FILE_NAME = "books.txt";

    public Library() {
        this.books = new ArrayList<>();
        loadBooks();
    }

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                System.out.println("❌ Error: A book with ID " + book.getId() + " already exists.");
                return;
            }
        }
        books.add(book);
        System.out.println("✅ Book added successfully.");
    }

    public void removeBook(int id) {
        Book book = findBook(id);
        if (book != null) {
            books.remove(book);
            System.out.println("✅ Book removed successfully.");
        } else {
            System.out.println("❌ Book ID not found.");
        }
    }

    public Book findBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public void borrowBook(int id) {
        Book book = findBook(id);
        if (book == null) {
            System.out.println("❌ Book not found.");
        } else if (!book.isAvailable()) {
            System.out.println("❌ Sorry, this book is already borrowed.");
        } else {
            book.borrowBook();
            System.out.println("✅ '" + book.getTitle() + "' borrowed successfully.");
        }
    }

    public void returnBook(int id) {
        Book book = findBook(id);
        if (book == null) {
            System.out.println("❌ Book not found.");
        } else if (book.isAvailable()) {
            System.out.println("🤔 This book was already in the library.");
        } else {
            book.returnBook();
            System.out.println("✅ '" + book.getTitle() + "' returned successfully.");
        }
    }

    public void searchBooks(String searchTerm) {
        System.out.println("--- Search Results for '" + searchTerm + "' ---");
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(searchTerm.toLowerCase()) || b.getAuthor().toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("No matching books found.");
    }

    public  void  viewBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void saveBooks() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (Book b : books) {
                writer.write(b.getId() + "," + b.getTitle() + "," + b.getAuthor() + "," + b.isAvailable() + "\n");
            }
            System.out.println("💾 Library catalog saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }

    private void loadBooks() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String title = parts[1];
                    String author = parts[2];
                    boolean available = Boolean.parseBoolean(parts[3]);
                    books.add(new Book(id, title, author, available));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading catalog: " + e.getMessage());
        }
    }
}
