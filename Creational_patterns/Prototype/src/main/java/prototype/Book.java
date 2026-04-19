package main.java.prototype;

public class Book implements Prototype<Book>{
    private String author;
    private String title;
    private String genre;
    private String publicationYear;


    public Book(String author, String title, String genre, String publicationYear) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;

    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public String getPublicationYear() {
        return publicationYear;
    }

    @Override
    public Book clone() {
        return new Book(author, title, genre, publicationYear);
    }
}
