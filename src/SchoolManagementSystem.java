import java.util.ArrayList;

class SchoolManagementSystem {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;

    public SchoolManagementSystem() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Teacher findTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }

    public void displayStudentGrades(Student student) {
        System.out.println("Grades for " + student.getName() + ":");
        for (Grade grade : student.getGrades()) {
            System.out.println("    Course: " + grade.getCourse().getName() + ", Score: " + grade.getScore());
        }
    }

    public void displayAvailableCourses() {
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println("    Course ID: " + course.getCourseId() + ", Name: " + course.getName());
        }
    }
}
