package com.company.class21;

public class Car {
    void start(){
        System.out.println("Use keys to start me");
    }
    void stop(){
        System.out.println("Use brakes to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    @Override
    void start(){
        System.out.println("Use the Button to start me");
    }
}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("Use Mobile App to start me");
    }

    @Override
    void park() {
        System.out.println("Use parking sensors to park me");
    }
}
class Toyota extends Car{
}
class CarTester{
    public static void main(String[] args) {
        Car car=new BMW();  // like widening conversion
        car.start();
        Car car2=new Toyota();
        car2.start();
        Car[] cars = {new BMW(), new Tesla(), new Toyota()};
        for(Car c: cars){
            c.start();
            c.stop();
            c.park();

        }


    }

}

