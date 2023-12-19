package com.student.student;

import java.util.List;
import java.util.Objects;

public final class Solution {
    /**
     * The employee who's department is CSE, Salary is less than or equal 40000 and Age is more than 28.0
     * @param employees
     * @return
     */
    public String getEmployee(List<Employee> employees){
        return employees
                .stream()
                .filter(Objects::nonNull)
                .filter(employee -> employee.department().name().compareTo("CSE") == 0)
                .filter(employee -> employee.age() >= 28.0F)
                .filter(employee -> employee.salary() <= 40000)
                .sorted((employees1, employees2) -> employees2.salary() - employees1.salary())
                .map(employee -> employee.name())
                .distinct()
                .findFirst()
                //.orElse("Saiful Islam")
                .orElseThrow(() -> new NullPointerException("No Employee is found"));
    }
}
