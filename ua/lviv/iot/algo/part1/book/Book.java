//laba1
package src.ua.lviv.iot.algo.part1.book;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@toString
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String genre;
    private int countInWarehouse;

    public Book(String title, String author, String publisher, int year, String genre, int countInWarehouse) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.genre = genre;
        this.countInWarehouse = countInWarehouse;
    }

    public int getBook(int quantity) {
        if (countInWarehouse >= quantity) {
            countInWarehouse -= quantity;
            return quantity;
        } else {
            int available = countInWarehouse;
            countInWarehouse = 0;
            return available;
        }
    }

    public boolean hasMoreBooks() {
        return countInWarehouse > 0;
    }
    public String getTitle(){
        return title;
    }
    public String getAutor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    public int getYear(){
        return year;
    }
    public String getGenre(){
        return genre;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCountInWarehouse(int countInWarehouse) {
        this.countInWarehouse = countInWarehouse;
    }

    public static void main(String[] args) {
        Book book = new Book("Harry Poter", "T.Tupytsia", "Lviv tratata", 2036, "Romantic", 20);
        System.out.println(book.getBook(7)); 
        System.out.println(book.hasMoreBooks()); 
        System.out.println(book.getBook(10)); 
        System.out.println(book.hasMoreBooks()); 
    }

}
