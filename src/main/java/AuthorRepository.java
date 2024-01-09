import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuthorRepository {

    private final JdbcConnection jdbcConnection = new JdbcConnection();

    public AuthorRepository() throws SQLException {
    }

    public void save(Author author) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addAuthor = "INSERT INTO authors(first_name , last_name , age) VALUES (? , ? , ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(addAuthor);

        preparedStatement.setString(1, author.getFirstname());
        preparedStatement.setString(2, author.getLastname());
        preparedStatement.setInt(3, author.getAge());

        preparedStatement.executeUpdate();


    }
}
