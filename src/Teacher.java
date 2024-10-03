import java.util.ArrayList;

class Teacher {
    private String name;
    private int id;

    public Teacher(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void assignGrade(Student student, Course course, double score) {
        Grade grade = new Grade(course, score);
        student.addGrade(grade);
    }
}

