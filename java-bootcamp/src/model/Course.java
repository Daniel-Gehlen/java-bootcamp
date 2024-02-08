// Course.java
package model;

public class Course {
    private String name;
    private String description;
    private int durationHours;

    public Course(String name, String description, int durationHours) {
        this.name = name;
        this.description = description;
        this.durationHours = durationHours;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationHours() {
        return durationHours;
    }
}
