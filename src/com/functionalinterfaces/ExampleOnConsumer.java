package com.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExampleOnConsumer {
    public static void main(String[] args) {


        List<String> CustomerList = Arrays.asList("customert1,customer2,customer3");
/*
the consumer is also a functional interface it can print the details or data
 */
        System.out.println("-- using consumer--");
        Consumer<String> isConsumer = name-> System.out.println(name);
        CustomerList.forEach(isConsumer);

        // by using lambda expression
        System.out.println("-- using lambda exppressions--");
        CustomerList.forEach(name -> System.out.println(name));

        // by using method reference
        System.out.println("-- using method reference--");
        CustomerList.forEach(System.out::println);
    }
}
