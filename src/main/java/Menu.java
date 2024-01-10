import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final AuthorService authorService = new AuthorService();

    public Menu() throws SQLException {
    }

    public void publicMenu() throws SQLException {
        System.out.println("***** WELCOME *****");
        System.out.println("1-SAVE UP");
        System.out.println("2-LOAD IN");
        System.out.println("3-DELETE");
        System.out.println("4-EXIT");
        System.out.println("Choose your number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {

            case 1 -> saveUp();
            case 2 -> loadIn();
            case 3 -> System.out.println("DELETE");
            case 4 -> System.out.println("EXIT");
        }
    }

    public void saveUp() throws SQLException {
        authorService.register();
    }

    public void loadIn() throws SQLException {
        authorService.loadIn();
    }

}
