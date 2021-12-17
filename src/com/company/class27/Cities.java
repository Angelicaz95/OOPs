package com.company.class27;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Cities {
    public static void main(String[] args) {
        Set<String> cities=new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Rochester");
        cities.add("Chicago");
        cities.add("Miami");
        cities.add("Los Angeles");
        cities.add("Amsterdam");

        Iterator<String> iterator=cities.iterator();
        while(iterator.hasNext()){
            String city=iterator.next();
            if(city.startsWith("A")){
                iterator.remove();
            }
        }



    }
}
