package com.company.class28;

import java.util.TreeMap;

public class Demo5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> building=new TreeMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(2, "Doordash");
        building.put(3, "Starbucks");
        building.put(4, "Airbnb");
        building.put(5, "Facebook");
        building.put(6, "Ebay");
        building.put(7, "Uber");
        System.out.println(building);
        building.replace(4, "Meta");
        building.remove(7);
        System.out.println(building);
        System.out.println(building.size());





    }


}
