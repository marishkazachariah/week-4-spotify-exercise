package exercise_4;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String name;
    private List<Course> courses = new ArrayList<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public Instructor(String name) {
        this.name = name;
    }

    public void assignCourse(Course course){
        this.courses.add(course);
    }

    public void unassignCourse(Course course){
        this.courses.remove(course);
    }
}
