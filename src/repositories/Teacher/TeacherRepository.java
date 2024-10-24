package repositories.Teacher;

import models.Teacher;

import java.util.HashMap;

public interface TeacherRepository {
    void save(Teacher teacher);
    Teacher find(String username);
    HashMap<String, Teacher> findAll();
    void update(Teacher teacher);
    void delete(Teacher teacher);
}
