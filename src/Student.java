import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private ArrayList<Grade> grades;
    private ArrayList<Course> enrolledCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
        this.enrolledCourses = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
