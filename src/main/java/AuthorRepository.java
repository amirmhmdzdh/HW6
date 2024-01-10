import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class AuthorRepository {

    private final JdbcConnection jdbcConnection = new JdbcConnection();

    public AuthorRepository() throws SQLException {
    }

    public int save(Author author) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addAuthor = "INSERT INTO authors(first_name , last_name , age , book) VALUES ( ? , ? , ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(addAuthor);


        preparedStatement.setString(1, author.getFirstname());
        preparedStatement.setString(2, author.getLastname());
        preparedStatement.setInt(3, author.getAge());
        preparedStatement.setString(4, Arrays.toString(author.getBooks()));
        int result = preparedStatement.executeUpdate();
        return result;

    }

    public Author load(int authorid) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String query = "SELECT * FROM authors WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, authorid);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstname = resultSet.getString("first_name");
            String lastname = resultSet.getString("last_name");
            int age = resultSet.getInt("age");
            String[] books = resultSet.getString("book").split(",");
            Author author = new Author(id, firstname, lastname, age, books);


            return author;
        } else
            return null;
    }
}

