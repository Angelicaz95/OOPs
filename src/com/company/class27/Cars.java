package com.company.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Tesla");
        cars.add("Audi");

        cars.add(1, "Mercedes"); // will be added in index number 1
        System.out.println(cars); // first way to retrieve the data from ArrayList

        for(String c: cars){ // because we are only using loop to access the elements, there is no harm in using the loop
            System.out.println(c);
        }

        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i)+" has "+cars.get(i).length()+" characters");

            // length() -> string;     size() -> lists;  .length -> arrays




        }
        int i=0;


        while(i < cars.size()){
            System.out.println(cars.get(i));
            i++;
        }


        Iterator<String> iterator=cars.iterator();
        // hasNext() returns true if there are still any elements in Iterator

        while(iterator.hasNext()){
            System.out.println(iterator.next()); // cant use the same iterator twice, only if it's reinitialized
        }
        System.out.println(cars.size()-1); // will print last element









    }

}
