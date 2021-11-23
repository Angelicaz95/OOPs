package com.company.class21;

public class CreditCard {
    double balance;
    double interest;
    CreditCard(double balance){
        this.balance=balance;
    }

    void calculateInterest(){
        interest=balance*0.15;
        System.out.println(interest);
        System.out.println(balance);
    }
        }
class AX extends CreditCard{
    AX(double balance){
        super(balance);

    }

    @Override
    void calculateInterest() {
       interest=balance*0.85;
        System.out.println(interest);
    }
}
class Visa extends CreditCard{
    Visa(double balance){
        super(balance);

    }

}
class CreditCardTester{
    public static void main(String[] args) {

    CreditCard cc=new CreditCard(10);
    cc.calculateInterest();
    AX ax=new AX(100);
    ax.calculateInterest();
    Visa visa=new Visa(200);
    visa.calculateInterest();
    }



}