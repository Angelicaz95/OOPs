package com.company.class22;

public class FatherTester {
    public static void main(String[] args) {
        Father son=new Son("Sharif");
       // Son father=new Father("Sharif's father"); not possible
        Son sharifObj=(Son) son; // storing the object on one type inside the other type only possible if we are storing the object in a parent class




    }
}
