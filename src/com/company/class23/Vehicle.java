package com.company.class23;

public abstract class Vehicle {
     String vinNumber; // abstract not allowed with field
    static int totalVehicles;

    // abstract Vehicle(){ // abstract is not allowed with constructors
      //  totalVehicles++;
  //  }
    Vehicle(String vinNumber){
        totalVehicles++;
        this.vinNumber=vinNumber;
        System.out.println("Grandpa's constructor is called");
    }
public void printVehicleCount(){
    System.out.println(totalVehicles+" vehicle count");
}
public void drive(){
    System.out.println("Vehicle is driving");
}
public void stop(){
    System.out.println("Vehicle is stopping");
}
public abstract void start();


}
abstract class Car extends Vehicle{
    String carType;
    Car( String carType, String vinNumber){
        super(vinNumber);
        this.carType=carType;
        System.out.println("Parent constructor is called");
    }
    public void drive(){
        System.out.println("Car is driving");
    }

    public abstract void speed();

}
class BMW extends Car{
    String make;
    String model;
    BMW(String vinNumber, String carType, String make, String model){
        super(vinNumber, carType);
        this.make=make;
        this.model=model;
        System.out.println("BMW constructor is called");

    }
    @Override
    public  void start(){
        System.out.println("BMW can start using remote");
    }
    @Override
    public void speed(){
        System.out.println("BMW can run 300km/h");
    }

}
class Toyota extends Car{
    String make;
    String model;
        Toyota(String vinNumber,String carType,String make,String model){
        super(vinNumber,carType);
        this.make=make;
        this.model=model;
        }
@Override
public  void start(){
        System.out.println("Toyota can start using keys");
        }
@Override
public void speed(){
        System.out.println("BMW can run 200km/h");
        }
        void displayInfo(){
            System.out.println(make+" "+model+" "+carType+" "+vinNumber);
        }
        }