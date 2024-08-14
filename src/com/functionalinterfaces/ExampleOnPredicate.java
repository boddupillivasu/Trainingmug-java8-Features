package com.functionalinterfaces;

import java.util.Arrays;
import java.util.function.Predicate;

public class ExampleOnPredicate {
    public static void main(String[] args) {

/*
predicate is a functional interface  and it is used for check the conditions
 */
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(103));
    }
}