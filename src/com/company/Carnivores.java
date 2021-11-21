package com.company;

public class Carnivores extends Mammal{
    String family;
    boolean eatsOtherAnimals;


    public static void main(String[] args) {

        Carnivores tiger=new Carnivores();
        tiger.type="Mammal";
        tiger.warmBlooded=true;
        tiger.species="Carnivores";
        tiger.family="Cat";
        tiger.eatsOtherAnimals=true;
        tiger.hunt();
        tiger.feedBaby();

    }


}
