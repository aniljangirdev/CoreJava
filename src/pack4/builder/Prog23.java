package pack4.builder;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Prog23 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(
                1,
                "Anil",
                101,
                new BigDecimal("111"),
                30
        );

        Employee employee2 = new Employee(
                1,
                "Sam",
                101,
                new BigDecimal("111"),
                30
        );

        Map<Employee, String> hashMap = new HashMap<>();

        hashMap.put(employee1, "EMP1");
        hashMap.put(employee2, "EMP1");

        // Employee as a key and String as value

        Singleton instance = Singleton.getInstance();
        instance.doStuff();
    }
}
