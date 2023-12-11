package model;

import model.Book;

import java.util.HashMap;

public class CartDTO extends HashMap<Book, Integer>{
//    private final Map<Book, Integer> map = new HashMap<>();

//    public Map<Book, Integer> getBookMap() {
//        return map;
//    }

    public void addToCart(Book book) {
        if (this.containsKey(book)) {
            System.out.println("true");
            //update value + 1
            Integer currentValue = this.get(book);
//            productMap.put(productDto, currentValue + 1);
            this.replace(book, currentValue + 1);
        } else {
            this.put(book, 1); //Lan dau dc them vao
            System.out.println("false");
        }
    }

    public void removeCart(String id) {
        Book bookToRemove = null;

        // Tìm mục cần xóa dựa trên id
        for (Book book : keySet()) {
            if (book.getId().equals(id)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            remove(bookToRemove);
        }
    }
}
