import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeHandlerTest {

    @Test
    public void testCaptureCurrentDateTime() {
        // Create an instance of DateTimeHandler
        DateTimeHandler dateTimeHandler = new DateTimeHandler();

        // Capture the current date and time
        dateTimeHandler.captureCurrentDateTime();

        // Get the current system time using LocalDateTime.now()
        LocalDateTime now = LocalDateTime.now();

        // Assert that the captured components match the current system time

    }

    // Add more tests as needed for other functionality
}
