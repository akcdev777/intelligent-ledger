import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private String url = "jdbc:mysql://localhost:3306/intelligent_ledger";
    private String username = "kopele";
    private String password = "kopele";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}