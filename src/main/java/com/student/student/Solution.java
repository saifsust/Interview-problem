package com.student.student;

import java.util.*;
import java.util.stream.Collectors;

public final class Solution {
    private static final String SEPARATOR = "/";

    public List<Integer> getPrimes(String str) {
        return Arrays.stream(str.split(SEPARATOR))
                .map(String::trim)
                .filter(Solution::isNumeric)
                .map(Integer::parseInt)
                .filter(Solution::isPrime)
                .collect(Collectors.toList());
    }

    private static boolean isNumeric(String str){
        try {
            Integer.parseInt(str);
            return true;
        }catch (Exception exception){
         return false;
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
