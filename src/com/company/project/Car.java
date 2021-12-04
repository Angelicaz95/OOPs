package com.company.project;

public class Car {
    double carPrice;
    String color;
    Car(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;

    }
    public double calculateSalePrice(){
        return carPrice;

    }
}
class Sedan extends Car{

    double length;
    Sedan(double carPrice, String color, double length){
        super(carPrice, color);
        this.length=length;

    }
    @Override
    public double calculateSalePrice(){

        if(length>20){
            carPrice=carPrice*0.05;
        } else{
            carPrice=carPrice*0.10;
        }
        return carPrice;

    }

}
class Truck extends Car {
    double weight;
    Truck(double carPrice, String color, double weight){
        super(carPrice, color);
        this.weight=weight;

    }
    @Override
    public double calculateSalePrice() {

        if (weight > 2000) {
            carPrice = carPrice * 0.10;
        } else {
            carPrice = carPrice * 0.20;
        }
        return carPrice;


    }
}
 class CarTester{
     public static void main(String[] args) {

         Sedan sedan = new Sedan(67000, "Black", 19);
         System.out.println(sedan.calculateSalePrice());

         Truck truck=new Truck(50000, "Grey", 2300);
         System.out.println(truck.calculateSalePrice());



     }
}