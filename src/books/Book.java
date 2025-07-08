package books;

import lombok.Getter;

@Getter
public abstract class Book {
    protected String ISBN;
    protected String title;
    protected int publishYear;
    protected double price;



    public boolean buyBook(int quantity, String email, String address) {
        System.out.println("Abstract book class method not implemented");
        return false;
    }
}

