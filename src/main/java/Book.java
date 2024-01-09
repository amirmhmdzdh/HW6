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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publication_year=" + publication_year +
                ", author=" + author +
                '}';
    }
}
