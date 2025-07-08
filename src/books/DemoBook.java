package books;

import lombok.AllArgsConstructor;
import services.ShippingService;

@AllArgsConstructor
public class DemoBook extends Book{

    public DemoBook(String isbn, String title, int yearPublished, double price){
        this.ISBN = isbn;
        this.title = title;
        this.publishYear = yearPublished;
        this.price =price;
    }
    public void buyBook(int quantity, String email, String address) {
        System.out.println("DemoBook not for sale.");
    }
}
