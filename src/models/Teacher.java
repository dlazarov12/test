package models;

public record Teacher (
     String name,
     int id,
     int courseId,
     String username,
     String password,
     boolean isAdmin
) {}

