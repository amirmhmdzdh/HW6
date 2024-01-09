import java.util.Arrays;

public class Author {
    private String firstname;
    private String lastname;
    private int age;
    private String[] books;

    public Author() {
    }

    public Author(String firstname, String lastname, int age, String[] books) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.books = books;
    }
}