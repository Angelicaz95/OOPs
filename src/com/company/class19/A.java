package com.company.class19;

public class A {
    public static void main(String[] args){

        C a=new C();
    }


}
class B{
    B(){
        System.out.println("B");
    }

}

class C extends B{
     C(){
        System.out.println("C");

    }
}
class D extends C{
    D(){
        System.out.println("D");
    }

}