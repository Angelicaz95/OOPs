package com.company.class20;

public class MethodOverloading2 {
    static void add(int ... arr){ // all parameters should  be int
        // can handle any number of parameters and arrays BUT  this method has the lowest priority

        int sum=0;
        for(int number:arr){
            sum=sum+number;
        }
        System.out.println(sum);

    }
    static void add(double num1, double num2){
        System.out.println(num1+num2);
    }


}
