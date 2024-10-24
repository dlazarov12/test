package repositories.Grade;

import models.Grade;

import java.util.List;

public interface GradeRepository {
    void add(Grade grade);
    void update(Grade grade);
    void delete(Grade grade);
    List<Grade> findAll();
    Grade findByReason(Grade grade);
}
