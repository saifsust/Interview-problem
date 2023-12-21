package com.student.serialization;

import java.io.Serializable;
import java.util.Optional;

public class Student {
    private String name;
    private Optional<Grade> grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Grade> getGrade() {
        return grade;
    }

    public void setGrade(Optional<Grade> grade) {
        this.grade = grade;
    }
}
