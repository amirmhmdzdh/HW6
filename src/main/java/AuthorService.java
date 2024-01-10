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


        Author author = new Author(firstname, lastname, age);
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
