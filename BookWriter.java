package ua.lviv.iot;

import ua.lviv.iot.algo.part1.book.Book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BookWriter {
    public void writeToFile(@org.jetbrains.annotations.NotNull List<Book> books) {
        try {
        
            File file = new File("books.csv");
            file.createNewFile();

           
            FileWriter writer = new FileWriter(file);

        
            String headers = books.get(0).getHeaders();
            writer.write(headers);
            writer.write("\n");

           
            for (Book book : books) {
                String csv = book.toCSV();
                writer.write(csv);
                writer.write("\n");
            }

          
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
