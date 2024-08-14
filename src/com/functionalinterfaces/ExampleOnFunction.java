package com.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExampleOnFunction {
    public static void main(String[] args) {
        List<String> CustomerList = Arrays.asList("customert1,customer2,customer3");

        // using function
/*
the Function is also a functional interface it used for applying the cases
 */
        Function<String, String> isUpeercase = name -> {
            name = name.toUpperCase();
            return name;
        };

        CustomerList.forEach(name -> System.out.println(isUpeercase.apply(name)));
        for (String name : CustomerList) {
            System.out.println(name);
        }
    }
}
