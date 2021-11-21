package com.company.class20.HomeWork;

public class CreditCard {
    double balance=23000;
    double interest=3.5;
    void calculate(){
        System.out.println((balance*interest)/100);

    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    double balance=30000;
    double interest=1.5;
    @Override
    void calculate(){
        System.out.println((balance*interest)/100);

    }

}

class CreditCardTester{
    public static void main(String[] args) {


    Visa a=new Visa();
    a.calculate();
    AX b=new AX();
    b.calculate();

    }
}
