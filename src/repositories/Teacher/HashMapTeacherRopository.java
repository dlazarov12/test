package repositories.Teacher;

import models.Teacher;

import java.util.HashMap;

public class HashMapTeacherRopository implements TeacherRepository {
    private HashMap<String, Teacher> teachers;

    public HashMapTeacherRopository() {
        teachers = new HashMap<>();
    }

    @Override
    public void save(Teacher teacher) {
        teachers.put(teacher.username(), teacher);
    }

    @Override
    public Teacher find(String username) {
        return teachers.get(username);
    }

    @Override
    public HashMap<String, Teacher> findAll() {
        return null;
    }

    @Override
    public void update(Teacher teacher) {
        teachers.replace(teacher.username(), teacher);
    }

    @Override
    public void delete(Teacher teacher) {
        teachers.remove(teacher.username());
    }
}
