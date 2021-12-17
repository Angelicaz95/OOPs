package com.company.class27;

import java.util.ArrayList;

public class Drinks {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Tea");
        arrayList.add("Coffee");
        arrayList.add("Soft drinks");
        arrayList.add("Pepsi");
        arrayList.add("Water");
        arrayList.add("Hot Chocolate");
        arrayList.add("Lemon Tea");

        // not changing the size of the list and just updating the elements, so we can use enhanced loop

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).toLowerCase().contains("e") || arrayList.get(i).toLowerCase().contains("a")){
                arrayList.set(i, "Water");

            }

        }
        System.out.println(arrayList);



    }
}
