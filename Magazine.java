package ua.lviv.iot.algo.part1.book;

public class Magazine extends Book {
    private int issueNumber;

    public Magazine(String title, String publisher, String author, int year, String genre, int issueNumber) {
        super(title, publisher, author, year, genre);
        this.issueNumber = issueNumber;
    }
}