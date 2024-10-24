package repositories.Student;

import models.Student;

public interface StudentRepository {
    void addStudent(Student student);
    void removeStudent(Student student);
    Student getStudent(String username);
}