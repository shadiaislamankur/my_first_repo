package com.example.lib;

public class MyClass6 {
    public static  void main(String[] args){

        //if statement
        int age = 18;
        if (age >=18){
            System.out.println("You are an adult");

        }
        else if (age ==60) {
            System.out.println("An aged person");
        }
        else
            System.out.println("You are not an adult");



        int dayOfWeek =3;
        switch (dayOfWeek){

            case 1 :
                System.out.println("Sunday");
                break;

            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednsday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;

            default:
                System.out.println("Saturday");
                break;





        }



    }



}
