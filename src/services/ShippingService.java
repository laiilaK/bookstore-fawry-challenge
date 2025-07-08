package services;

import books.Book;

public class ShippingService {
    public void  ship(Book book, int quantity, String address){
        System.out.println("Shipping "+quantity+" copies of book: "+book.getTitle()+" to address: "+address);
    }
}
