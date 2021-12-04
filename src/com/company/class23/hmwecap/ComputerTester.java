package com.company.class23.hmwecap;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] computers={new Apple("Apple"), new Lenovo("Lenovo")};
        for(Computer c: computers){
            c.oS();
            c.playVideoGames();
        }


    }

}
