package com.company.class26.homework;



import java.util.LinkedHashSet;

public class Cities {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Amsterdam");
        cities.add("New York");
        cities.add("Kyiv");
        cities.add("Rome");
        cities.add("Paris");

       cities.removeIf(element -> element.startsWith("A"));
      //  cities.removeIf(n -> n.charAt(0)=='A');

        System.out.println(cities);







        }


    }




