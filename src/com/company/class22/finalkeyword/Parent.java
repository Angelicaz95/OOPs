package com.company.class22.finalkeyword;

 class Parent {
    final double GRAVITY; // can't be changed
     Parent(double gravity){
         this.GRAVITY=gravity;
     }
    void printGravityValue(){ // can't override final method
        System.out.println(GRAVITY);

    }

}

class Child extends Parent{ // can't inherit from class which is declared final
double gravity=10.2;
Child(double gravity){
    super(gravity);

}
}
 class FinalDemo{

}