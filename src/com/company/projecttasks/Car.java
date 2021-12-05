package com.company.projecttasks;

public class Car {
    double carPrice;

    public Car(double carPrice){
        this.carPrice=carPrice;

    }
    double calculateSalePrice(){
        return carPrice;
    }


}
class Sedan extends Car{
    double length;
   public Sedan(double carPrice, double length){
        super(carPrice);
        this.length=length;
    }
    @Override
    double calculateSalePrice(){
        return !(length > 20) ? carPrice * 0.9 : carPrice * 0.95;

    }
}
class Tester{
    public static void main(String[] args) {

    }
}
