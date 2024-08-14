package com.java8features;

public class ExampleOnClass implements ExampleOnInterface {
    @Override
    public void sayHello() {
        System.out.println("this is say Hello Method inside the class ");
    }

    @Override
    public void hii() {
        System.out.println("this is hii method inside the class");
    }
}
