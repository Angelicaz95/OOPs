package com.company.class21;

import com.company.class20.MethodOverloading;

public class MethodOverloadingDemo {

    void  method (int number) {
       System.out.println(number);
    }


    public static void main(String[] args) {
        MethodOverloadingDemo  md =new MethodOverloadingDemo();
        md.method(10);



    }
}
