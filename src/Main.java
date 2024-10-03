
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem sms = new SchoolManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Sample Data
        Teacher teacher = new Teacher("John Doe", 1);
        sms.addTeacher(teacher);

        Course math = new Course("Math 101", 101);
        Course english = new Course("English 101", 102);
        sms.addCourse(math);
        sms.addCourse(english);

        Student student1 = new Student("Geri", 1001);
        sms.addStudent(student1);

        // Menu Loop
        while (true) {
            System.out.println("\nSchool Management System");
            System.out.println("1. Teacher: Assign Grade");
            System.out.println("2. Student: View Grades");
            System.out.println("3. Student: Enroll in Course");
            System.out.println("4. Display Available Courses");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Teacher assigns a grade
                    System.out.print("Enter Student ID to assign grade: ");
                    int studentId = scanner.nextInt();
                    Student student = sms.findStudentById(studentId);
                    if (student != null) {
                        System.out.print("Enter Course ID: ");
                        int courseId = scanner.nextInt();
                        Course course = sms.getCourses().get(courseId - 101); // Adjust index
                        System.out.print("Enter Score: ");
                        double score = scanner.nextDouble();
                        teacher.assignGrade(student, course, score);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 2:
                    // Student views grades
                    System.out.print("Enter your Student ID: ");
                    int viewId = scanner.nextInt();
                    Student viewStudent = sms.findStudentById(viewId);
                    if (viewStudent != null) {
                        sms.displayStudentGrades(viewStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    // Student enrolls in course
                    System.out.print("Enter your Student ID: ");
                    int enrollId = scanner.nextInt();
                    Student enrollStudent = sms.findStudentById(enrollId);
                    if (enrollStudent != null) {
                        sms.displayAvailableCourses();
                        System.out.print("Enter Course ID to enroll: ");
                        int enrollCourseId = scanner.nextInt();
                        Course enrollCourse = sms.getCourses().get(enrollCourseId - 101); // Adjust index
                        enrollStudent.enrollInCourse(enrollCourse);
                        System.out.println(enrollStudent.getName() + " enrolled in " + enrollCourse.getName());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    sms.displayAvailableCourses();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
