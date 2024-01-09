public class Book {

    private String title;
    private int publication_year;
    private Author author;

    public Book() {
    }

    public Book(String title, int publication_year, Author author) {
        this.title = title;
        this.publication_year = publication_year;
        this.author = author;
    }
}
