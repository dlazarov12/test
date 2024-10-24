package repositories.Grade;

import models.Grade;

import java.util.ArrayList;
import java.util.List;

public class ListGradeRepository implements GradeRepository {
    List<Grade> grades;

    public ListGradeRepository() {
        grades = new ArrayList<>();
    }

    @Override
    public void add(Grade grade) {
        grades.add(grade);
    }

    @Override
    public void update(Grade grade) {
        if(grades.contains(grade)) {
            grades.set(grades.indexOf(grade), grade);
        }
    }

    @Override
    public void delete(Grade grade) {
        if (findByReason(grade) != null){
            grades.remove(grade);
        }
    }

    @Override
    public List<Grade> findAll() {
        return grades;
    }

    @Override
    public Grade findByReason(Grade grade) {
        Grade foundGrade = null;
        for(Grade g:grades){
            if(g.reason().equals(grade.reason())){
                foundGrade = g;
            }
        }
        return foundGrade;
    }
}
