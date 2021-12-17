package com.company.class26.homework;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }

    public abstract  void getQuota();
    public abstract void cancelInsurance();

}
class Car extends Insurance{
    String carModel;
    Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }
    public void getQuota(){
        System.out.println("Getting quota for car insurance");
    }
    public void cancelInsurance(){
        System.out.println("Cancel car insurance");
    }

}
class Pet extends Insurance {
    String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    public void getQuota() {
        System.out.println("Getting quota for pet insurance");

    }

    public void cancelInsurance() {
        System.out.println("Cancel pet insurance");
    }
}
class Health extends Insurance{
    Health(String insuranceName){
        super(insuranceName);
    }
    public void getQuota(){
        System.out.println("Getting quota for health insurance");
    }
    public void cancelInsurance(){
        System.out.println("Cancel health insurance");
    }
}



class InsuranceTester{
    public static void main(String[] args) {


        ArrayList<Insurance> i=new ArrayList<>();
        i.add(new Car("American Family", "Audi"));
        i.add(new Pet("Pet insurance", "Dog"));
        i.add(new Health("Blue Cross Blue Shield"));

        System.out.println("Advanced for loop");

        for(Insurance insurances: i){
            insurances.getQuota();
            insurances.cancelInsurance();
        }
        System.out.println("Iterator");
        Iterator<Insurance>iterator=i.iterator();
        Insurance in= iterator.next();
        in.cancelInsurance();
        in.getQuota();



        }



        }



