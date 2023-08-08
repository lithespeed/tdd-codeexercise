package test.unit.com.bookapplication;

import junit.framework.Assert;
import main.com.bookapplication.Book;
import main.com.bookapplication.BookRepository;
import main.com.bookapplication.BookService;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class BookServiceTest {

    @Test
    public void itFindsBookInStock() {
        // arrange
        String bookId = "bookId";
        BookRepository stub = mock(BookRepository.class);
        BookService sut = new BookService(stub);
        Book foundBook = new Book(1, "Title", "Author", bookId);
        doReturn(foundBook).when(stub).findBookById(anyString());
        // act
        boolean bookIsFound = sut.isBookInStock("bookId");
        // assert
        assertTrue(bookIsFound);
    }

    @Test
    public void itDoesNotFindBookInStock() {
        // arrange
        BookRepository stub = mock(BookRepository.class);
        BookService sut = new BookService(stub);
        doReturn(null).when(stub).findBookById(anyString());
        // act
        boolean bookIsFound = sut.isBookInStock("bookId");
        // assert
        assertFalse(bookIsFound);
    }

    @Test
    public void itFindsMatchOnBookIdButZeroInStock() {
        // arrange
        String bookId = "bookId";
        BookRepository stub = mock(BookRepository.class);
        BookService sut = new BookService(stub);
        Book notFoundBook = new Book(0, "Title", "Author", bookId);
        doReturn(notFoundBook).when(stub).findBookById(anyString());
        // act
        boolean isBookFound = sut.isBookInStock("bookId");
        // assert
        assertFalse(isBookFound);
    }
}
