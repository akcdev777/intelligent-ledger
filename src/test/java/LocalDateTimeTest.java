import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LocalDateTimeTest {

    @Test
    public void testGenerateTimestamp() {
        LocalDateTime timestamp = LocalDateTime.now();

        // Assert that the timestamp is not null
        assertNotNull(timestamp);

        // Print the generated timestamp (optional)
        System.out.println("Generated Timestamp: " + timestamp);
    }

    @Test
    public void testEqualsAndHashCode() {
        LocalDateTime timestamp1 = new LocalDateTime(2023, 1, 15, 12, 30, 45);
        LocalDateTime timestamp2 = new LocalDateTime(2023, 1, 15, 12, 30, 45);

        // Assert equality based on overridden equals method
        assertEquals(timestamp1, timestamp2);
    }

    // Add more tests as needed for other functionality
}
