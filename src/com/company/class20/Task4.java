package com.company.class20;

public class Task4 {
    private void method(){
        System.out.println("void method");

    }
    private int method(int num){
        System.out.println("int method");
        return num;
    }
    private int method(String str){
        System.out.println("int method");
        return 5;
    }

    public static void main(String[] args) {
        Task4 a=new Task4();
        a.method("A");




    }
}
