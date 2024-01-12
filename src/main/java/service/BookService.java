package service;
import repository.BookRepository;
import java.sql.SQLException;
import java.util.Scanner;
import model.Book;
public class BookService {
    private final Scanner scanner = new Scanner(System.in);
    private final BookRepository bookRepository = new BookRepository();

    public BookService() throws SQLException {
    }

    public void addBook() throws SQLException {

        System.out.println("please enter title book: ");
        String title = scanner.nextLine();

        System.out.println("please enter publicationyear: ");
        int publication_year = scanner.nextInt();
        ;

        Book book = new Book(title, publication_year);
        System.out.println(book);

        bookRepository.save(book);
    }

    public Book loadIn() throws SQLException {

        System.out.println("please enter your id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Book book = bookRepository.load(id);
        System.out.println(bookRepository.load(id));
        return book;

    }

    public void deleteIn() throws SQLException {
        System.out.println("Please enter the id of the book you want to delete: ");
        Book book = loadIn();
        bookRepository.delete(book);


    }
}
