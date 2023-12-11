package service;

import model.Book;

import java.util.HashMap;

public class CartBean extends HashMap {
    public CartBean() {
        super();
    }

    public void addBook(Book book){
        String key=book.getName();
    }

    public boolean removeBook(String title){
        if(this.containsKey(title)){
            this.remove(title);
            return true;
        }
        return false;
    }
}
