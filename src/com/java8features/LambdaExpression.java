package com.java8features;

public class LambdaExpression {
    public static void main(String[] args) {

/*
lambda expression are used for simplifying the anonymous classes

syntax;-

interference ref = (// parameters )->{// for multiple statements}
 */
        ExampleOnSingleAbstractMethod example;
        example = () -> {
            System.out.println("this is single abstract method using lambda Expression by printing the two statements");
            System.out.println("this is single abstract method using lambda Expression by printing the two statements");
        };
        example.display();
        ExampleOnSingleAbstractMethod example1;
        example1 = () ->
                System.out.println("this is single abstract method using lambda Expression by printing the single statement");


        example.display();
    }
}