package com.example.lib;

public class MyClass17 {
    public static void main(String[] args) {
        //object: an instance of a class
        //class: is a template or blueprint


        //Syntax of Object Creation
        //className object = new className();

        Car redCar = new Car();
        redCar.speed =180;
        redCar.year=2023;


        redCar.accelerate();
        redCar.accelerate();
        redCar.brake();

    }
}
//Syntax of class Creation
//class className{
// fields -states - attributes : store data
//Method - functionalities - behaviour : perform operation

//}




class Car{
    //states
    int year;
    int speed;

    //Method
    void accelerate(){
        speed += 10;
        System.out.println("Your new Speed is: "+speed);

    }
    void brake(){
        speed -=5;
        System.out.println("Your new Speed is: "+speed);
    }

}
