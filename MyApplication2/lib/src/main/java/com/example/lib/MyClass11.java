package com.example.lib;

public class MyClass11 {
    public static void main(String[] args) {
        // a method is a block of code that performs a
        //specific task

        //Types of Methods:
            //User-defined Methods
            //Standard Library method

        //Declaring a java method
//        returnType  methodName(){
//            //method body
//        }

        sayHello();
        System.out.println();
       int w = addNumbers();
        System.out.println("The value of W: " +w);
        System.out.println();


    }

    static void sayHello(){
        System.out.println();
        System.out.println("Hello from the Method");
        System.out.println();

    }

    static int addNumbers(){
        int x=10;
        int y=20;

        int z=x+y;

        return  z;

    }
}
