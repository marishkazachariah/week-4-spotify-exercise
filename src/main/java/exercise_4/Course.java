package exercise_4;

import java.util.List;

public class Course {
    String name;
    int courseCode;
    List<Student> enrolledStudents;

    public Course(String name, int courseCode, List<Student> enrolledStudents) {
        this.name = name;
        this.courseCode = courseCode;
        this.enrolledStudents = enrolledStudents;
    }

    public void addStudent(Student student){
        enrolledStudents.add(student);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }
}
