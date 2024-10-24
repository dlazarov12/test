package repositories.Student;

import models.Student;

import java.util.HashMap;

public class HashMapStudentRepository implements StudentRepository {
    private HashMap<String, Student> students;

    public HashMapStudentRepository() {
        students = new HashMap<>();
    }

    @Override
    public void addStudent(Student student) {
        students.put(student.username(), student);
    }

    @Override
    public void removeStudent(Student student) {
        if(getStudent(student.username()) != null) {
            students.remove(student.username());
        }
    }


    @Override
    public Student getStudent(String username) {
        return students.get(username);
    }
}
