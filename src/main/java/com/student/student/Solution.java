package com.student.student;

import java.util.List;
import java.util.Objects;

public final class Solution {

    public List<String> getStudentsAboveGrade (List<Student> students) {
        return students
                .stream()
                .filter(Objects::nonNull)
                .filter(student -> Objects.nonNull(student.grade())) // Optional Grade object is not null
                .filter(student -> student.grade().isPresent()) // Containing Object within Optional is not null
                .filter(student -> Objects.nonNull(student.grade().get().value())) // Grade object's value is not null
                .filter(student -> student.grade().get().value().compareTo("C") <= 0)
                .sorted((student1, student2)-> student2.grade().get().value()
                        .compareTo(student1.grade().get().value()))
                .map(student -> student.name())
                .distinct()
                .toList();
    }
}
