public class Book {
    private int id;
    private String title;
    private int publication_year;
    private int author;

    public Book() {
    }

    public Book(String title, int publication_year) {
        this.title = title;
        this.publication_year = publication_year;
        this.author = author;
    }

    public Book(int id, String title, int publication_year, int author) {
        this.id = id;
        this.title = title;
        this.publication_year = publication_year;
        this.author = author;
    }

    public int getId() {
        return id;
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

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publication_year=" + publication_year +
                ", author=" + author +
                '}';
    }
}

