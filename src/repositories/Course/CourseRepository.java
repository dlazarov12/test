package repositories.Course;

import models.Course;

public interface CourseRepository {
    void add(Course course);
    void update(Course course, String name);
    void delete(Course course, String name);
    Course find(String name);
}
