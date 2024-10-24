package repositories.Course;

import models.Course;

import java.util.HashMap;

public class HashMapCourseRepository implements CourseRepository{
    HashMap<String, Course> courses;

    public HashMapCourseRepository() {
        courses = new HashMap<>();
    }

    @Override
    public void add(Course course) {
        courses.put(course.name(), course);
    }

    @Override
    public void update(Course course, String name) {
        Course toEdit = courses.get(name);
        if (toEdit != null) {
            courses.put(toEdit.name(), course);
        }
    }

    @Override
    public void delete(Course course, String name) {
        if (courses.containsKey(name)) {
            courses.remove(name);
        }
    }

    @Override
    public Course find(String name) {
        return courses.get(name);
    }
}
