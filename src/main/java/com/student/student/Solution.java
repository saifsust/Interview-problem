package com.student.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public final class Solution {

    public List<String> getGrades(List<Student> students) {
        Map<String, List<Student>> grouped = new HashMap<>();

        students
                .stream()
                .filter(Objects::nonNull)
                .distinct()
                .filter(student -> student.getGrade().isPresent())
                .forEach(student -> {
                    if (grouped.get(student.getGrade().get().getValue()) == null) {
                        grouped.put(student.getGrade().get().getValue(), new ArrayList<>());
                    }
                    grouped.get(student.getGrade().get().getValue()).add(student);
                });

        return grouped
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }
}
