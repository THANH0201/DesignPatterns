package main.java.prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Prototype<Recommendation> {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience, List<Book> books) {
        this.targetAudience = targetAudience;
        this.books = books;
    }
    public String getTargetAudience() {
        return targetAudience;
    }
    public void setTargetAudience(String newAudience) {
        this.targetAudience = newAudience;
    }
    public List<Book> getBooks() {
        return books;
    }
    @Override
    public Recommendation clone() {
        List<Book> cloneBooks = new ArrayList<>();
        for (Book book : this.books) {
            cloneBooks.add(book.clone()); // deep clone
        }
        return new Recommendation(targetAudience, cloneBooks);
    }

    public void addBook(Book b) {
        books.add(b);
    }

}
