package com.student.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class StudentApplicationTests {
    private final Solution solution = new Solution();

    @Test
    void positiveTest1() {
        var input = "///2/3/ 4/  5/sfd/s/1424///11";
        var expectedResult = Arrays.asList(2, 3, 5, 11);
        var actualResult = solution.getPrimes(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void positiveTest2() {
        var input = "///sfd/s/1424///11/df/31/fdkfj/97/76";
        var expectedResult = Arrays.asList(11, 31, 97);
        var actualResult = solution.getPrimes(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
