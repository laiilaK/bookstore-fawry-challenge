package books;

import lombok.AllArgsConstructor;
import lombok.Getter;
import services.EmailService;
@Getter
@AllArgsConstructor
public class EBook extends Book{
    protected String fileType;

    public EBook(String isbn, String title, int yearPublished, double price, String fileType) {
        this.ISBN = isbn;
        this.title = title;
        this.publishYear = yearPublished;
        this.price =price;
        this.fileType = fileType;
    }

    public boolean buyBook(int quantity, String email, String address) {
        EmailService service = new EmailService() ;
        service.send(this ,quantity ,  email);
        return true;
    }
}
