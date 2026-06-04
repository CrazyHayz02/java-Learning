public class Book {
    String title;
    String author;
    int pages;

    // Display the details of the book
    void displayBook() {
        System.out.println(
                "The Book is " + title + " by " + author + " with " + pages + " pages."
        );
    }
}
