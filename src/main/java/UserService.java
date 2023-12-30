import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
    private DatabaseConnection dbConnection;

    public UserService(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public boolean registerUser(User user) {
        String sql = "INSERT INTO User(username, passwordHash) VALUES(?, ?)";

        try (Connection conn = dbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPasswordHash());
            pstmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean loginUser(User user) {
        String sql = "SELECT * FROM User WHERE username = ? AND password = ?";
    
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
    
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
    
            ResultSet rs = pstmt.executeQuery();
    
            // if the result set is not empty, the user credentials are correct
            if (rs.next()) {
                String privileges = rs.getString("privileges");
                if ("admin".equals(privileges)) {
                    System.out.println("Admin user logged in successfully.");
                    // call admin functions here
                } else {
                    System.out.println("Regular user logged in successfully.");
                    // call regular user functions here
                }
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}