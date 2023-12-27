

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

    // Getters and Setters
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Methods
    @Override
    public String toString() {
        return "LocalDateTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    // Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LocalDateTime)) return false;
        LocalDateTime that = (LocalDateTime) o;
        return year == that.year &&
                month == that.month &&
                day == that.day &&
                hour == that.hour &&
                minute == that.minute &&
                second == that.second;
    }
    //now() method to capture the current system time
    public static LocalDateTime now() {
        DateTimeHandler dateTimeHandler = new DateTimeHandler();
        dateTimeHandler.captureCurrentDateTime();
        return new LocalDateTime(dateTimeHandler.getYear(), dateTimeHandler.getMonth(), dateTimeHandler.getDay(),
                dateTimeHandler.getHour(), dateTimeHandler.getMinute(), dateTimeHandler.getSecond());
    }




}
