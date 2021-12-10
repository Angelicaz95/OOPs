package com.company.class26.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Mazda");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Tesla");


        // 1. Using advanced for loop
        for(String c: cars){
            System.out.println(c);
        }
        // 2. Using for loop
        for(int counter=0; counter<cars.size(); counter++){
            System.out.println(cars.get(counter));
        }
        // 3. Iterator
        Iterator<String> iterator=cars.iterator();
        while(iterator.hasNext()){
            String element=iterator.next();
            System.out.println(element);
        }





    }


}
