package com.student.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class StudentApplicationTests {
    private final Solution solution = new Solution();
    private List<Employee> employees = new ArrayList<>();

    // all employees information is dummy.
    @BeforeEach
    void setUp(){
        employees.addAll( Arrays.asList(
                new Employee("Saiful Islam", new Department("CSE"), 28.0F, 20000),
                new Employee("Mahmud Hasan", new Department("CSE"), 32.0F, 30000),
                new Employee("Mohammad Asif", new Department("CSE"), 33.0F,45000),
                new Employee("Nabil Hasan", new Department("CSE"), 30.0F,  25000),
                new Employee("Ponir Dada", new Department("ENGINEERING DIVISION"), 33.0F, 50000),
                new Employee("Rahul Dada", new Department("TEAM BEAUTY"), 31.0F, 40000))
        );
    }

    @Test
    void positiveEmployeeTest(){
        var expectedResult = "Mahmud Hasan";
        var actualResult = solution.getEmployee(employees);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void positiveEmployeeTest2(){
        employees.add(null);
        var expectedResult = "Mahmud Hasan";
        var actualResult = solution.getEmployee(employees);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void negativeEmployeeTest1(){
        employees.clear();
        employees.addAll( Arrays.asList(
                new Employee("Mohammad Asif", new Department("CSE"), 33.0F,45000),
                new Employee("Ponir Dada", new Department("ENGINEERING DIVISION"), 33.0F, 50000),
                new Employee("Rahul Dada", new Department("TEAM BEAUTY"), 31.0F, 40000))
        );
        Assertions.assertThrows(NullPointerException.class, ()-> solution.getEmployee(employees));

    }
}
