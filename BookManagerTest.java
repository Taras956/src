package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.book.Book;
import ua.lviv.iot.algo.part1.book.BookManager;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookManagerTest {

    private BookManager bookManager;

    @BeforeEach
    public void setUp() {
        bookManager = new BookManager();
        bookManager.addBook(new Book("Harry Potter", "J.K. Rowling", "Bloomsbury Publishing", 1997, "Fantasy"));
        bookManager.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1954, "Fantasy"));
        bookManager.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "George Allen & Unwin", 1937, "Fantasy"));
        bookManager.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 1951, "Realistic fiction"));
    }

    @Test
    @DisplayName("Test searchByAuthor method")
    public void testSearchByAuthor() {
        List<Book> expectedBooks = new ArrayList<>();
        expectedBooks.add(new Book("Harry Potter", "J.K. Rowling", "Bloomsbury Publishing", 1997, "Fantasy"));
        expectedBooks.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1954, "Fantasy"));
        expectedBooks.add(new Book("The Hobbit", "J.R.R. Tolkien", "George Allen & Unwin", 1937, "Fantasy"));
        List<Book> actualBooks = bookManager.searchByAuthor("J.R.R. Tolkien");
        assertEquals(expectedBooks, actualBooks);
    }

    @Test
    @DisplayName("Test searchByGenre method")
    public void testSearchByGenre() {
        List<Book> expectedBooks = new ArrayList<>();
        expectedBooks.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1954, "Fantasy"));
        expectedBooks.add(new Book("The Hobbit", "J.R.R. Tolkien", "George Allen & Unwin", 1937, "Fantasy"));
        List<Book> actualBooks = bookManager.searchByGenre("Fantasy");
        assertEquals(expectedBooks, actualBooks);
    }
}
