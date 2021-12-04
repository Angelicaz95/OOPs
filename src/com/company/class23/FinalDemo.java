package com.company.class23;

public class FinalDemo {
    private final String NAME="Fatma";
    protected final int AGE=29;
    final double HEIGHT=5.4;
    static final double WEIGHT_OF_HUMAN=55;
    final static  int NO_OF_LEGS=2;
    String hairColor;
    final void printName(){
        System.out.println(NAME);
    }
    void printHairColor(){
        System.out.println(hairColor);
    }

    protected final void printHEIGHT(){
        System.out.println(HEIGHT);
    }
    final void printAge(){
        System.out.println(AGE);
    }
    public static final void print(){ // we can redeclare static method, but not override it
        System.out.println(WEIGHT_OF_HUMAN);
    }
    public static void printNoOfLegs(){
        // System.out.println(WEIGHT_OF_AVG_HUMAN); not allowed because its an instance field
        System.out.println(NO_OF_LEGS);
    }




}
class Child extends FinalDemo{
    public static void printNoOfLegs(){
        // System.out.println(WEIGHT_OF_AVG_HUMAN); not allowed because its an instance field
        System.out.println("From Child"+NO_OF_LEGS);
    }
    void printHairColor(){
        System.out.println("Black from Child");
    }



}
class Tester{
    public static void main(String[] args) {
        Child child=new Child();
        child.printHairColor();
        child.printAge();
        child.printHEIGHT();
        child.printNoOfLegs();



    }
}