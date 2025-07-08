import books.DemoBook;
import books.EBook;
import books.PaperBook;

public class Main {
    public static void main(String args[]){
        BookManager store = new BookManager();

        // Add books to the store
        store.addBook(new PaperBook("123", "Java Fundamentals", 2018, 50.0, 10));
        store.addBook(new EBook("456", "Quantum Computing 101", 2022, 30.0, "PDF"));
        store.addBook(new DemoBook("789", "Ancient Manuscript", 1950, 0.0));

        // buy a book
        store.buyBook("123", 2, "alice@example.com", "City A");
        store.buyBook("456", 1, "bob@example.com", "City B");
        store.buyBook("789", 1, "charlie@example.com", "City C");

        // Remove books older than 10 years
        store.removeOutdatedBook(10);
    }
}
