package com.company.class22.homework;

public class Computer {
    String model;
    String oS;

    Computer(String model, String oS){
        this.model=model;
        this.oS=oS;
    }
    public void price(){
        System.out.println("Computer cost around $1200");
    }
    public void printInfo(){
        System.out.println(model+" has "+oS+" operating system");
    }

}
class Apple extends Computer{
    Apple(String model,String oS){
        super(model, oS);
    }
    @Override
    public void price(){
        System.out.println("Apple computers tend to cost more than average price");
    }
    public void chip(){
        System.out.println("According to Apple, the M1 chip is faster than the Intel processors in the Macs it replaces.");
    }

}
class Lenovo extends Computer{
    Lenovo(String model, String oS) {
        super(model,oS );
    }
    @Override
    public void price(){
        System.out.println("Lenovo computers cost a little bit less than average price ");
    }
    public void quality(){
        System.out.println("Lenovo computers are known for their great quality and reliable battery life ");
    }

}
class HP extends Computer{
    HP(String model, String oS){
        super(model, oS);
}
@Override
public void price(){
    System.out.println("HP computers cost around $1200");
}
public void performance(){
    System.out.println("Most of HP products offer more functions and better specifications than other brands' laptops of the same price.");
}

}
class Dell extends Computer {
    Dell(String model, String oS) {
        super(model, oS);
    }
    @Override
    public void price(){
        System.out.println("Dell computers cost less than average price");
    }
    public void variety(){
        System.out.println("Dell produces notebooks ranging from budget laptops to high-end products");
    }
}
