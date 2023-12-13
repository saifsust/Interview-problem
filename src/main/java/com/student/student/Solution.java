package com.student.student;

import java.util.*;
import java.util.stream.Collectors;

public final class Solution {

    public List<String> getStudentsAboveGrade (List<Student> students) {
        return students
                .stream()
                .filter(student -> student.getGrade().isPresent() && student.getGrade().get().getValue().compareTo("C") >= 0)
                .map(student -> student.getName())
                .collect(Collectors.toList());
    }
}
