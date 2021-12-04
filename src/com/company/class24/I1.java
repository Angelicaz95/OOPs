package com.company.class24;

public interface I1 {
     int age=10;
    void method();
     static void method2(){
        System.out.println("I am method2 from Interface1");
    }
}
interface I2{
     int age=15;
    void method();

    static void method2(){
        System.out.println("I am method2 from Interface2");
    }
}
class Test1 implements I1, I2{

    @Override
    public void method() {
        System.out.println(I1.age);
        System.out.println(I2.age);
        System.out.println("I will be called for both methods from both interfaces ");
    }
}
class Main1{
    public static void main(String[] args) {
        I1 i1=new Test1();
        i1.method();
        I1.method2(); // fix for a diamond problem
        I2.method2();


    }
}