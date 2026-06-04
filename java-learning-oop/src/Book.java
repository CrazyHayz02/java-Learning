public class Book {
    String title;
    String author;
    int pages;

    void displayBook() {
        System.out.println(
                "The Book is " + title + " by " + author + " with " + pages + " pages."
        );
    }
}
