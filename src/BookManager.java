import books.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookManager {

    private List<Book> inventory = new ArrayList<>();

    public void addBook(Book book) {
        String isbn = book.getISBN();
        for (Book Ibook : inventory) {
            if (Ibook.getISBN().equals(isbn)) {
                System.out.println("Adding error: a book with the same ISBN is already in inventory \nISBN: " + book.getISBN());
                return;
            }
        }
        inventory.add(book);
        System.out.println("Book added with ISBN: " + book.getISBN());
    }

    public void removeBook(String isbn){
        for (Book Ibook : inventory) {
            if (Ibook.getISBN().equals(isbn)) {
                inventory.remove(Ibook);
                System.out.println("Removed book with ISBN "+isbn);
                return;
            }
        }
        System.out.println("Book not found to remove");
    }

    public void removeOutdatedBook(int year){
        int currentYear = LocalDate.now().getYear();
        inventory.removeIf(book -> {
            if ((currentYear - book.getPublishYear())> year) {
                System.out.println("Removed outdated book ISBN: " + book.getISBN());
                return true;
            }
            return false;
        });

    }

    public double buyBook(String isbn, int quantity, String email, String address){
        for (Book book : inventory) {
            if (book.getISBN().equals(isbn)) {
                book.buyBook(quantity, email, address);
                double price = book.getPrice() * quantity;
                System.out.println("Total price: "+price);
                return price;
            }
        }
        System.out.println("Book not found");
        return 0.0;
    }
}
