package com.student.student;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Student {
    private String name;
    private Optional<Grade> grade;
}
