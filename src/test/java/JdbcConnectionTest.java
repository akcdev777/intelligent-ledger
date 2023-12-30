import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class JdbcConnectionTest {

    @Test
    void testJdbcConnection() {
        // Replace "myDb", "user1", and "pass" with your actual database, username, and password
        String jdbcUrl = "jdbc:mysql://localhost:3306/intelligent_ledger";
        String username = "kopele";
        String password = "kopele";

        try (Connection con = DriverManager.getConnection(jdbcUrl, username, password)) {
            // The connection is successfully established if this block is executed
            assertTrue(con.isValid(5)); // Additional check to ensure the connection is valid
            System.out.println("Valid MySQL DB Connection");
        } catch (SQLException e) {
            // If an exception occurs, fail the test
            fail("Exception occurred while testing JDBC connection: " + e.getMessage());
        }
    }
}
