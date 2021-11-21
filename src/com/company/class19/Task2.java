package com.company.class19;

public class Task2 {
    public static void main(String[] args) {
        F.printF();

    }
}
class E{
    static void printF(){
        System.out.println("printF from class A");

    }
}

class F extends E{

}