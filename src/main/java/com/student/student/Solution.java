package com.student.student;

import java.util.*;
import java.util.stream.Collectors;

public final class Solution {

    public List<String> getStudentsAboveGrade (List<Student> students) {
        return students
                .stream()
                .filter(Objects::nonNull)
                .filter(student -> Objects.nonNull(student.getGrade())) // Optional Grade object is not null
                .filter(student -> student.getGrade().isPresent()) // Containing Object within Optional is not null
                .filter(student -> Objects.nonNull(student.getGrade().get().getValue())) // Grade object's value is not null
                .filter(student -> student.getGrade().get().getValue().compareTo("C") <= 0)
                .map(student -> student.getName())
                .collect(Collectors.toList());
    }
}
