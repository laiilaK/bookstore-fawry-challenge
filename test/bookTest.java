import books.Book;
import books.DemoBook;
import books.EBook;
import books.PaperBook;
import org.junit.jupiter.api.Test;

public class bookTest {
    BookManager store = new BookManager();

    Book b1 = new PaperBook("123", "Java Fundamentals", 2018, 50.0, 10);
    Book b2 = new EBook("456", "Quantum Computing 101", 2022, 30.0, "PDF");
    Book b3 = new DemoBook("789", "Ancient Manuscript", 1950, 0.0);

    @Test
    //Adding multiple different books, some with the same ISBN
    public void addBook(){

        store.addBook(b1);
        store.addBook(b2);
        store.addBook(b3);
        store.addBook(b3);
        store.addBook(b2);
        store.addBook(b1);

    }

    @Test
    //Remove non-existent books
    public void removeBooks(){
        store.removeBook("123");
        store.removeBook("123");
        store.removeBook("123");
        store.removeBook("0000");
    }

    @Test
    public void removeOutdated(){
        store.removeOutdatedBook(1);
        store.removeOutdatedBook(5);
        store.removeOutdatedBook(100);
    }

}
