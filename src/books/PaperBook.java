package books;

import lombok.AllArgsConstructor;
import lombok.Getter;
import services.ShippingService;

@Getter
public class PaperBook extends Book{

    protected int quantity;

    public PaperBook(String isbn, String title, int yearPublished, double price,  int quantity) {
        this.ISBN = isbn;
        this.title = title;
        this.publishYear = yearPublished;
        this.price =price;
        this.quantity = quantity;
    }


    public void buyBook(int quantity, String email, String address) {
        if (quantity > this.quantity){
            System.out.println("Book quantity is more than available");
            return;
        }
        this.quantity -= quantity;
        ShippingService service = new ShippingService();
        service.ship(this,quantity , address);
    }

}
