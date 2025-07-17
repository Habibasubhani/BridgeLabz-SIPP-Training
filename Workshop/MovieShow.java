package LocalRepo.Workshop;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MovieShow {
    private String name;
    private LocalTime time;

    public MovieShow(String name, String timeStr) {
        this.name = name;
        this.time = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("HH:mm"));
    }

    public LocalTime getTime() {
        return time;
    }

    public String toString() {
        return name + " at " + time.toString();
    }
}
