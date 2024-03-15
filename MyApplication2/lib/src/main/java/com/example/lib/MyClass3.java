package com.example.lib;

public class MyClass3 {
    public  static void main(String[] args) {

        //Type Casting: is the process of converting
        //a value from one data type to another

        // Implicit type casting
        int numInt = 10;
        double numDouble = numInt;  //10.0


        //Explicit Type Casting
        double pi = 3.14;
        int numPI = (int) pi;

        int myInt =5;
        char myChar=(char) (myInt + 'A');
        System.out.println((myChar));



        System.out.println(numPI);
    }


}
