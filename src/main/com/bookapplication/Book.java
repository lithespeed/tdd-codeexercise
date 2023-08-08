package main.com.bookapplication;

public class Book {
    private int numberInStock;
    private String title;
    private String author;
    private String bookId;

    public Book(int numberInStock, String title, String author, String bookId) {
        this.numberInStock = numberInStock;
        this.title = title;
        this.author = author;
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }
}
