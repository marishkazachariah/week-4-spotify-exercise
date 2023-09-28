package exercise_4;

import java.util.List;

public class Student {
    String name;
    int id;
    List<Course> courses;

    public Student(String name, int id, List<Course> courses) {
        this.name = name;
        this.id = id;
        this.courses = courses;
    }

    public void enroll(Course course) {
        courses.add(course);
    }

    public void dropCourse(Course course) {
        courses.remove(course);
    }
}
