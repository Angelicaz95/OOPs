package com.company.class23.hmwecap;

public class Computer {
    String model;
    Computer(String model){
        this.model=model;
    }
    void oS(){
        System.out.println(model+" has operating system");
    }
    void playVideoGames(){
        System.out.println("Can play video games");
    }
}
class Apple extends Computer{
    Apple(String model){
        super(model);
    }
    @Override
    void oS(){
        System.out.println(model+" has MacOS");
    }
}
class Lenovo extends Computer{
    Lenovo(String model){
        super(model);
    }
    @Override
    void oS(){
        System.out.println(model+" has Windows");
    }
}