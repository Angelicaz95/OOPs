package com.company.class24;

public interface Interfacedemo1 {
    void drive();
}
class Bike implements Interfacedemo1{

    @Override
    public void drive() {
        System.out.println("Driving a bike");
    }
}
class Car implements Interfacedemo1{

    @Override
    public void drive() {
        System.out.println("Driving a car");

    }
}
