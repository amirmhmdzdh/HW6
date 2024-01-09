import java.sql.SQLException;
import java.util.Scanner;

public class AuthorService {

    private final Scanner scanner = new Scanner(System.in);
    private final AuthorRepository authorRepository = new AuthorRepository();

    public AuthorService() throws SQLException {
    }

    public void register() throws SQLException { // نام و خانوادگی و سن
        System.out.println("please enter your firstname: ");
        String firstname = scanner.nextLine();

        System.out.println("please enter your lastname: ");
        String lastname = scanner.nextLine();

        System.out.println("please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Please enter the number of books: ");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();

        String[] books = new String[numberOfBooks];

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Please enter the title of book " + (i + 1) + ": ");
            String bookTitle = scanner.nextLine();
            books[i] = bookTitle;
        }


        Author author = new Author(firstname, lastname, age, books);
        System.out.println(author);

        authorRepository.save(author);

    }

}