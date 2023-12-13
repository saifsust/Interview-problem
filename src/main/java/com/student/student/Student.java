package com.student.student;

import java.util.Optional;

public record Student(String name, Optional<Grade> grade) {
}
