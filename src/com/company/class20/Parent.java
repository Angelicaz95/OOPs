package com.company.class20;

public class Parent {
    String name="Sedat";
    void printName(){
        System.out.println("name is "+name);

    }

    void getMarried(){
        System.out.println("Ahmet will get married by my choice");
    }
}
class Child extends Parent{
    String name="Ahmet";
    void printName(){
        String name="Sharif";
        System.out.println(name); // Sharif - because it's a local variable
        System.out.println(this.name); // Ahmet - because this keyword refers to insstance variable
        System.out.println(super.name); // Sedat - because super keyword refers to parent class
    }

    @Override
    void getMarried(){
        System.out.println("But I like someone else");
    }
    void letsDoSomethingCrazy(){
        super.getMarried();
        getMarried();
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.letsDoSomethingCrazy();
    }
}