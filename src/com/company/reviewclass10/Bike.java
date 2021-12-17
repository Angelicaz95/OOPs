package com.company.reviewclass10;

public class Bike {
        static final int SPEED_LIMIT; // i can't change its value but it can be
        //inherited and can be overridden.
        static{ // initializer blocks. we can use them to give initial value to the static fields if we need to calculate the value of that field based on some complex formula.

                SPEED_LIMIT=1000;
        }
        final int maxSeatingCapacity; // final variable can be left not declared in only one condition - it has to be initialized inside the constructor
        Bike(int maxSeatingCapacity, int SPEED_LIMIT){
                this.maxSeatingCapacity=maxSeatingCapacity;
              //  this.SPEED_LIMIT=SPEED_LIMIT; cant initialize static final fields inside the constructors
        }

        static void run(){

                System.out.println("Honda Bike can run "+SPEED_LIMIT+" Km/h"); // Inheriting it
        }
}
class HondaBike extends Bike{

        HondaBike(int maxSeatingCapacity, int SPEED_LIMIT) {
                super(maxSeatingCapacity, SPEED_LIMIT);
        }

        //static int SPEED_LIMIT=200; //overriding it in the child class
        static void run(){
                //int SPEED_LIMIT=300;
                System.out.println("Honda Bike can run "+SPEED_LIMIT+" Km/h"); // Inheriting it
        }
}

class Main{
        public static void main(String[] args) {
                HondaBike hondaBike=new HondaBike(678, 1000);
                hondaBike.run();
        }
}