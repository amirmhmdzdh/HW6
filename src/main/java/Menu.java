import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final AuthorService authorService = new AuthorService();
    private final BookService bookService = new BookService();

    public Menu() throws SQLException {
    }

    public void publicMenu() throws SQLException {
        System.out.println("***** WELCOME *****");
        System.out.println("1-SAVE UP");
        System.out.println("2-SAVE BOOK");
        System.out.println("3-LOAD IN");
        System.out.println("4-LOAD BOOK");
        System.out.println("5-DELETE");
        System.out.println("6-EXIT");

        System.out.println("Choose your number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {

            case 1 -> saveUp();
            case 2 -> addbooks();
            case 3 -> loadIn();
            case 4 ->loadbook();
            case 5 -> deletebook();
            case 6 -> System.out.println("EXIT\n GoodLuck");


        }
    }


    public void saveUp() throws SQLException {
        authorService.register();

    }

    public void addbooks() throws SQLException {
        bookService.addBook();
    }

    public void loadIn() throws SQLException {
        authorService.loadIn();
    }

    public void loadbook() throws SQLException {
        bookService.loadIn();

    }
  public void deletebook() throws SQLException {
        bookService.deleteIn();
  }


}
