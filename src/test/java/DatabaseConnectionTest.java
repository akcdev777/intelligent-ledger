import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ledger";
    private static final String USERNAME = "ledger";
    private static final String PASSWORD = "N7z6UxSFu7FylJDw";

    @Test
    public void testDatabaseConnection() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            assertNotNull(connection, "Connection should not be null");
            assertTrue(connection.isValid(5), "Connection should be valid");

            // Example query: Select the count of records from a table
            String query = "SELECT COUNT(*) FROM asset";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                // Process the result set
                assertTrue(resultSet.next(), "Result set should have at least one row");
                int count = resultSet.getInt(1);

                // Assert that the count is greater than or equal to 0
                assertTrue(count >= 0, "Count should be greater than or equal to 0");
            }
        } catch (SQLException e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
}
