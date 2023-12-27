
public class LocalDateTime {

    // Class to facilitate the use of LocalDateTime timestamp

    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public LocalDateTime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Default Constructor
    public LocalDateTime() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }


}
