package repository;

import model.Book;
import connection.JdbcConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRepository {

    private final JdbcConnection jdbcConnection = new JdbcConnection();

    public BookRepository() throws SQLException {
    }


    public int save(Book book) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addbook = "INSERT INTO books(title , publication_year)VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(addbook);

        preparedStatement.setString(1, book.getTitle());
        preparedStatement.setInt(2, book.getPublication_year());

        preparedStatement.executeUpdate();


        return 0;
    }

    public Book load(int bookId) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String query = "SELECT * FROM books WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bookId);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String title = resultSet.getString("title");
            int publication_year = resultSet.getInt("publication_year");
            int authorid = resultSet.getInt("author_id");
            Book book = new Book(id, title, publication_year, authorid);

            return book;
        } else
            return null;
    }

    public Book delete(Book book) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String deleteQuery = "DELETE FROM books WHERE id = ?";
        PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
        deleteStatement.setInt(1, book.getId());

        int rowsAffected = deleteStatement.executeUpdate();

        if (rowsAffected > 0) {
            return book;

        } else {
            return null;
        }
    }


}



