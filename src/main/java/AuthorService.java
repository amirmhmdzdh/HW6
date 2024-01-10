import java.sql.SQLException;
import java.util.Scanner;

public class AuthorService {

    private final Scanner scanner = new Scanner(System.in);
    private final AuthorRepository authorRepository = new AuthorRepository();

    public AuthorService() throws SQLException {
    }

    public void register() throws SQLException {
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
        int result = authorRepository.save(author);

        if (result == 1)
            System.out.println(firstname + " you successfully saveup :) ");
        else
            System.out.println(" Eror404 :/ ");

    }

    public void loadIn() throws SQLException {

        System.out.println("please enter your id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(authorRepository.load(id));
    }

}
