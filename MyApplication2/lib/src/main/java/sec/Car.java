package sec;

public class Car {


    //states
    int year;
    int speed;

    //Method
    protected void accelerate(){
        speed += 10;
        System.out.println("Your new Speed is: "+speed);

    }
    public void brake(){
        speed -=5;
        System.out.println("Your new Speed is: "+speed);
    }

    public Car(int carSpeed,int carYear){
        year=carYear;
        speed=carSpeed;
    }

    public void setSpeed(int i) {

    }
}
