package com.student.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class StudentApplicationTests {
    private Logger LOG = LoggerFactory.getLogger(StudentApplicationTests.class);
    private final Solution solution = new Solution();
    private List<Employee> employees = new ArrayList<>();

    // all employees information is dummy.
    @BeforeEach
    void setUp(){
        employees.addAll( Arrays.asList(
                new Employee("Saiful Islam", "CSE", 28.0F, 20000),
                new Employee("Mahmud Hasan", "CSE", 32.0F, 30000),
                new Employee("Mohammad Asif", "CSE", 33.0F,45000),
                new Employee("Nabil Hasan", "CSE", 30.0F,  25000),
                new Employee("Ponir Dada", "ENGINEERING DIVISION", 33.0F, 50000),
                new Employee("Rahul Dada", "TEAM BEAUTY", 31.0F, 40000))
        );
    }

    @Test
    void positiveEmployeeTest(){
        var expectedResult = new HashMap<String, List<Employee>>();
        expectedResult.put("CSE", Arrays.asList(
                new Employee("Mahmud Hasan", "CSE", 32.0F, 30000),
                new Employee("Mohammad Asif", "CSE", 33.0F,45000)));
        expectedResult.put("ENGINEERING DIVISION", Arrays.asList(new Employee("Ponir Dada", "ENGINEERING DIVISION", 33.0F, 50000)));
        expectedResult.put("TEAM BEAUTY", Arrays.asList(new Employee("Rahul Dada", "TEAM BEAUTY", 31.0F, 40000)));
        var actualResult = solution.getEmployee(employees);
        LOG.info("{}",actualResult);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
