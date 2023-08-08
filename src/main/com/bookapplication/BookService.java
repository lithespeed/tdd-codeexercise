package main.com.bookapplication;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public boolean isBookInStock(String bookId) {
        Book book = bookRepository.findBookById(bookId);
        return book != null && book.getNumberInStock() > 0;
    }
}
