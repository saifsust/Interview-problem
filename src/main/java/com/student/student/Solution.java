package com.student.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public final class Solution {
    /**
     * The employee who's department is CSE, Salary is less than or equal 40000 and Age is more than 28.0
     * @param employees
     * @return
     */
    public Map<String, List<Employee>> getEmployee(List<Employee> employees){
       return employees
               .stream()
               .filter(Objects::nonNull)
               .filter(employee -> employee.getSalary() >= 28000)
               .filter(employee -> employee.getAge() >= 28.0)
               .collect(Collectors.groupingBy(employee -> employee.getDepartment()));
    }
}
