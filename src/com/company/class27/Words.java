package com.company.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Life");
        arrayList.add("Orange");
        arrayList.add("Car");
        arrayList.add("Lamp");
        arrayList.add("Purple");
        arrayList.add("Love");

        // This operation might change the size of the original list, so it's not a good idea to use loops without iterator
        Iterator<String> iterator= arrayList.iterator();
        while(iterator.hasNext()) {


            String word = iterator.next();

            if (word.toLowerCase().endsWith("e")) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);






    }
}
