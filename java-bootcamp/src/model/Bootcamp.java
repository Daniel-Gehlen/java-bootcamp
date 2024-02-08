// Bootcamp.java
package model;

import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String name;
    private List<Course> courses;
    private List<Mentorship> mentorships;
    private List<Dev> devs;

    public Bootcamp(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.mentorships = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Mentorship> getMentorships() {
        return mentorships;
    }

    public List<Dev> getDevs() {
        return devs;
    }
}
