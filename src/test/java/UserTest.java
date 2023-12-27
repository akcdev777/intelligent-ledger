import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {

    @Test
    public void testUserConstruction() {
        User user = new User("userId123", "john_doe", "hashedPassword");

        // Assert that the user object is constructed correctly
        assertEquals("userId123", user.getUserId());
        assertEquals("john_doe", user.getUsername());
        assertEquals("hashedPassword", user.getPasswordHash());
    }

    @Test
    public void testUserEquality() {
        User user1 = new User("userId123", "john_doe", "hashedPassword");
        User user2 = new User("userId123", "john_doe", "hashedPassword");
        User user3 = new User("userId456", "jane_doe", "hashedPassword");

        // Assert equality for user1 and user2
        assertEquals(user1, user2);

        // Assert inequality for user1 and user3
        assertNotEquals(user1, user3);
    }

    @Test
    public void testUserHashCode() {
        User user1 = new User("userId123", "john_doe", "hashedPassword");
        User user2 = new User("userId123", "john_doe", "hashedPassword");
        User user3 = new User("userId456", "jane_doe", "hashedPassword");

        // Assert equal hash codes for user1 and user2
        assertEquals(user1.hashCode(), user2.hashCode());

        // Assert inequality for hash codes of user1 and user3
        assertNotEquals(user1.hashCode(), user3.hashCode());
    }

    // Add more tests as needed for other functionality
}
