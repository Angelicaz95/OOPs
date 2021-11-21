package com.company.class20;

public class MethodOverloadingTester {
    public static void main(String[] args) {
        MethodOverloading.add(10,20);
        MethodOverloading.addDouble(20.0, 30.0);
        int[] arr={10,10,10};
        MethodOverloading.addArray(arr);
    }
}
