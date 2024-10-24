package services;

import models.Teacher;
import repositories.Teacher.TeacherRepository;

import java.util.HashMap;

public class TeacherService {
    TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    HashMap<String, Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    void updateTeacher(Teacher teacher) {
        teacherRepository.update(teacher);
    }

    void deleteTeacher(Teacher teacher) {
        teacherRepository.delete(teacher);
    }
}
