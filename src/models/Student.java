package models;

import java.util.ArrayList;

public record Student (
     String name,
     int id,
     String username,
     String password,
     ArrayList<Grade> grades,
     ArrayList<Course> enrolledCourses
) {}
