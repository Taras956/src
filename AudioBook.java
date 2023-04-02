package ua.lviv.iot.algo.part1.book;

public class AudioBook extends Book {
    private int lengthInSeconds;

    public AudioBook(String title, String publisher, String author, int year, String genre, int lengthInSeconds) {
        super(title, publisher, author, year, genre);
        this.lengthInSeconds = lengthInSeconds;
    }
}
