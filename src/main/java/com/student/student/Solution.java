package com.student.student;

import io.micrometer.common.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class Solution {

    public List<String> getGrades (List<Student> students) {
        return students
                .stream()
                .filter(Objects::nonNull)
                .distinct()
                .filter(student -> student.getGrade().isPresent())
                .filter(student -> !StringUtils.isEmpty(student.getGrade().get().getValue()))
                .collect(Collectors.groupingBy(student->student.getGrade().get().getValue()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }
}
