import java.time.LocalDateTime;

public class DateTimeHandler {

    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public DateTimeHandler() {
        // Initialize with default values
        this.year = 0;
        this.month = 0;
        this.day = 0;
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    // Getters (omitted for brevity)



    // Method to capture the current system time
    // Method to capture the current system time
    public void captureCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        this.year = currentDateTime.getYear();
        this.month = currentDateTime.getMonthValue();
        this.day = currentDateTime.getDayOfMonth();
        this.hour = currentDateTime.getHour();
        this.minute = currentDateTime.getMinute();
        this.second = currentDateTime.getSecond();
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public int getYear() {
        return this.year;

    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }
}
