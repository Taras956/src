package ua.lviv.iot.algo.part1.book;
import lombok;

@ToString
@Getter
@Setter

public class ElectronicBook extends Book {
    private String format;
    private long fileSizeInBytes;
    private static final int BYTES_PER_PAGE_COUNT = 1024;

    public ElectronicBook(String title, String publisher, String author, int year, String genre, String format, long fileSizeInBytes) {
        super(title, publisher, author, year, genre);
        this.format = format;
        this.fileSizeInBytes = fileSizeInBytes;
    }


    public int getPagesCount() {
        return (int) (fileSizeInBytes / BYTES_PER_PAGE_COUNT);
    }
}

