import books.Book;
import books.DemoBook;
import books.EBook;
import books.PaperBook;
import org.junit.jupiter.api.Test;

public class BuyTest {

    BookManager store = new BookManager();

    Book b1 = new PaperBook("123", "Java Fundamentals", 2018, 50.0, 10);
    Book b2 = new EBook("456", "Quantum Computing 101", 2022, 30.0, "PDF");
    Book b3 = new DemoBook("789", "Ancient Manuscript", 1950, 0.0);

    @Test
    public void buy(){
        createBooks();
        //buy out of stock books
        store.buyBook("123", 9, "alice@gmail.com", "City A" );
        store.buyBook("123", 9, "alice@gmail.com", "City A" );

        //buy ebooks
        store.buyBook("456", 9, "alice@gmail.com", "City A" );
        store.buyBook("456", 9, "alice@gmail.com", "City A" );


        //buy demo book
        store.buyBook("789", 9, "alice@gmail.com", "City A" );

    }

    private void createBooks() {
        store.addBook(b1);
        store.addBook(b2);
        store.addBook(b3);

    }

}
