package com.company;

public class Mammal extends Animal{
    boolean warmBlooded;
    String species;
    void feedBaby() {
        System.out.println(species+" produce milk to nourish their babies");

    }

    public static void main(String[] args) {

        Mammal a=new Mammal();
        a.type="Mammal";
        a.size="large";
        a.eat();
        a.hunt();
        a.warmBlooded=true;
        a.sleep();





    }




}
