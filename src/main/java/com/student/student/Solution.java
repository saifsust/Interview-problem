package com.student.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class Solution {
    /**
     * The employee who's department is CSE, Salary is less than or equal 40000 and Age is more than 28.0
     * @param employees
     * @return
     */
    public Map<String, List<Employee>> getEmployee(List<Employee> employees){
        Map<String, List<Employee>> grouping = new HashMap<>();
        employees
                .stream()
                .filter(Objects::nonNull)
                .filter(employee -> employee.getAge()>= 24.0)
                .filter(employee -> employee.getSalary() >= 28000)
                .forEach(employee -> {
                    if(grouping.get(employee.getDepartment()) == null){
                        grouping.put(employee.getDepartment(), new ArrayList<>());
                    }
                    grouping.get(employee.getDepartment()).add(employee);
                });
        return grouping;
    }
}
