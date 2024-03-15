package sec;

public class MyClass {
    public static void main(String[] args) {
        //object : an instance of a class
        // class: is a template of blueprint

        Car redCar = new Car(100,2023);

        redCar.accelerate();
        redCar.brake();

        redCar.accelerate();
        redCar.accelerate();
        redCar.brake();



    }
}
