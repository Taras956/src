package ua.lviv.iot.algo.part1.book;
import lombok;

@ToString
@Getter
@Setter

public class PaperBook extends Book {
    private int pageCount;
    private int widthInMm;
    private int heightInMm;

    public PaperBook(String title, String publisher, String author, int year, String genre, int pageCount, int widthInMm, int heightInMm) {
        super(title, publisher, author, year, genre);
        this.pageCount = pageCount;
        this.widthInMm = widthInMm;
        this.heightInMm = heightInMm;
    }

   
    public int getPagesCount() {
        return pageCount;
    }
}