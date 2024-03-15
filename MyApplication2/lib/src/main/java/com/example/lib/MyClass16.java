//Method overloading
package com.example.lib;

public class MyClass16 {
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
        int w = addNumbers(10,20);
        System.out.println("The value of W: " +w);
        System.out.println();
        System.out.println("The sum of the value: "+addNumbers(10.8,9.7));


    }

    static void sayHello(){
        System.out.println();
        System.out.println("Hello from the Method");

        System.out.println();

    }

    static int addNumbers(int x, int y){


        return  x+y ;

    }

    static double addNumbers(double z, double w){
        return z+w;
    }
}
