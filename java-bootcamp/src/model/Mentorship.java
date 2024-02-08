// Mentorship.java
package model;

import java.time.LocalDateTime;

public class Mentorship {
    private String mentorName;
    private String description;
    private LocalDateTime schedule;

    public Mentorship(String mentorName, String description, LocalDateTime schedule) {
        this.mentorName = mentorName;
        this.description = description;
        this.schedule = schedule;
    }

    public String getMentorName() {
        return mentorName;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getSchedule() {
        return schedule;
    }
}
