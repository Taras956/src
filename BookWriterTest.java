package ua.lviv.iot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.book.Book;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookWriterTest {

    @Test
    public void testWriteToFile() throws IOException {
        
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", "J.K. Rowling", "Bloomsbury Publishing", 1997, "Fantasy"));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1954, "Fantasy"));

        
        BookWriter bookWriter = new BookWriter();
        bookWriter.writeToFile(books);

      
        String generatedContent = new String(Files.readAllBytes(Paths.get("books.csv")));

       
        String expectedContent = "title,publisher,author, year, genre\n" +
                "Harry Potter,Bloomsbury Publishing,J.K. Rowling,1997,Fantasy\n" +
                "The Lord of the Rings,George Allen & Unwin,J.R.R. Tolkien,1954,Fantasy\n";

       
        Assertions.assertEquals(expectedContent, generatedContent);

       
        File file = new File("books.csv");
        file.delete();
    }
}