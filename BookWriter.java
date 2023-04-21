package ua.lviv.iot;

import ua.lviv.iot.algo.part1.book.Book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BookWriter {
    public void writeToFile(@org.jetbrains.annotations.NotNull List<Book> books) {
        try {
            // Створюємо новий файл з розширенням .csv
            File file = new File("books.csv");
            file.createNewFile();

            // Створюємо об'єкт FileWriter для запису даних у файл
            FileWriter writer = new FileWriter(file);

            // Записуємо заголовки колонок у файл
            String headers = books.get(0).getHeaders();
            writer.write(headers);
            writer.write("\n");

            // Записуємо дані про кожен об'єкт у файл
            for (Book book : books) {
                String csv = book.toCSV();
                writer.write(csv);
                writer.write("\n");
            }

            // Закриваємо файл
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
