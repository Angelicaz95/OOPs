package com.company.class26.homework;

import java.util.ArrayList;


public class Drinks {
    public static void main(String[] args) {
        ArrayList<String> drinks= new ArrayList<>();
        drinks.add("Margarita");
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Mojito");
        drinks.add("Wine");
        drinks.add("Champagne");
        drinks.add("Lemonade");

        for(int i=0; i<drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                System.out.println(drinks.get(i).replaceAll(drinks.get(i), "Water"));

            } else {
                System.out.println(drinks.get(i));
            }
        }

            for(String d: drinks){
                if(d.contains("a")|| d.contains("e")){
                    d="Water";
                }

                System.out.print(d+" ");
            }





            }

        }









