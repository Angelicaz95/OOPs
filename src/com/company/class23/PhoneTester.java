package com.company.class23;

public class PhoneTester {
    public static void main(String[] args) {
       // Phone p=new Phone(); - object can't be created because class is abstract

        Iphone iphone=new Iphone();
        iphone.displayPictures();
        iphone.makePhoneCalls();
        iphone.unlockPhone();
        iphone.sendText();

        Samsung samsung = new Samsung();
        samsung.displayPictures();
        samsung.unlockPhone();
        samsung.sendText();
        samsung.sendText();
        System.out.println("----------------");
        Phone[] phones={new Iphone(), new Samsung()};
        for(Phone p:phones){
            p.displayPictures();
            p.makePhoneCalls();
            p.displayPictures();
            p.sendText();
        }



    }
}
