package sec;

public class Car2 {
    //states
    private int year;
    private int speed;


    public int getYear(){
        return  year;

    }

    public  void  setYear(int newYear){
        year = newYear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Method
    protected void accelerate(){
        speed += 10;
        System.out.println("Your new Speed is: "+speed);

    }
    public void brake(){
        speed -=5;
        System.out.println("Your new Speed is: "+speed);
    }

    public Car2(int carSpeed, int carYear){
        year=carYear;
        speed=carSpeed;
    }

}
