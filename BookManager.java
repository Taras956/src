package ua.lviv.iot.algo.part1.book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }
    
    public List<Book> searchByGenre(String genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equals(genre)) {
                result.add(book);
            }
        }
        return result;
    }
    

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new PaperBook("Harry Poter", "Lviv tratata", "T.Tupytsia", 2036, "Romantic", 349, 150, 228));
        books.add(new ElectronicBook("Harry Poter", "Lviv tratata", "T.Tupytsia", 2036, "Romantic", "PDF", 1024 * 1024));

        for (Book book : books) {
            System.out.println(book);
        }

        BookManager bookManager = new BookManager();
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "Bloomsbury Publishing", 1997, "Fantasy");
        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1954, "Fantasy");
        bookManager.addBook(book1);
        bookManager.addBook(book2);
        List<Book> booksByAuthor = bookManager.searchByAuthor("J.K. Rowling");
List<Book> booksByGenre = bookManager.searchByGenre("Fantasy");

for (Book book : booksByAuthor) {
    System.out.println(book.getTitle() + " by " + book.getAuthor());
}

for (Book book : booksByGenre) {
    System.out.println(book.getTitle() + " is a " + book.getGenre() + " book");
}
    }
}