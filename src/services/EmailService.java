package services;

import books.Book;

public class EmailService {
    public void  send(Book book,int quantity,  String email){
        System.out.println("Sending "+ quantity + " copies of book: "+book.getTitle()+" to email: " + email);
    }
}
