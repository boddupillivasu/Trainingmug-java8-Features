package com.java8features;

public class Main {
    public static void main(String[] args) {


        /*
        this is basic implementation  of abstract methods but we have disadvantages so we can
        using anonymous classes for implementing the interface
         */
//         creating object for normal class
        ExampleOnClass exampleOnClass;
        exampleOnClass = new ExampleOnClass();
        exampleOnClass.sayHello();
        exampleOnClass.hii();


        /* by creating the anonymous  class for an interface
         */

        ExampleOnInterface exampleOnInterface = new ExampleOnInterface() {
            @Override
            public void sayHello() {
                System.out.println("this is hello method  inside anonymous class ");

            }

            @Override
            public void hii() {
                System.out.println("this is hii method  inside anonymous class ");
            }

        };
        exampleOnInterface.sayHello();
        exampleOnInterface.hii();

    }

}