package com.company.class26.homework;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class CreditCard {
    String cardType;
    public CreditCard(String cardType){
        this.cardType=cardType;

    }
    public abstract void payOffBalance();
    public void checkRewards(){
        System.out.println("Checking the rewards");
    }

}
class CapitalOne extends CreditCard{
    CapitalOne(String carType){
        super(carType);

    }


    @Override
    public void payOffBalance() {
        System.out.println("Paying off balance before due date");

    }
}
class Chase extends CreditCard{
    Chase(String cardType){
        super(cardType);
    }

    @Override
    public void payOffBalance() {
        System.out.println("Paying off balance on a due date");
    }
}
class BankOfAmerica extends CreditCard{
    BankOfAmerica(String cardType){
        super(cardType);
    }

    @Override
    public void payOffBalance() {
        System.out.println("Paying off the balance past due");

    }
}
class CreditCardTester{
    public static void main(String[] args) {
        LinkedList<CreditCard> cc=new LinkedList<>();
        cc.add(new CapitalOne("Capital One"));
        cc.add(new Chase("Chase"));
        cc.add(new BankOfAmerica("Bank of America"));

        Iterator<CreditCard> creditCard=cc.iterator();
        while(creditCard.hasNext()){
            CreditCard c= creditCard.next();
            c.checkRewards();
            c.payOffBalance();


        }

    }
}