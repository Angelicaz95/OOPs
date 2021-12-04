package com.company.class24;

public interface Interface1 {
    default void method1(){
        System.out.println("i am a default method in interface");
    }
    static void method2(){
        System.out.println(" i am static method in interface");
    }
}
class Test implements Interface1{

}
class Main{
    public static void main(String[] args) {
        Interface1.method2();
        Test t=new Test();
        t.method1();
        new Test().method1();
       //  new Test().method2(); not allowed

    }
}