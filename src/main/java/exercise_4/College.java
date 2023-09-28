package exercise_4;

import java.util.ArrayList;
import java.util.List;

public class College {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Instructor> instructors = new ArrayList<>();

    public void addStudent(Student newStudent){
        students.add(newStudent);
    }

    public void addCourse(Course newCourse){
        courses.add(newCourse);
    }

    public void addInstructor(Instructor newInstructor){
        instructors.add(newInstructor);
    }
}
