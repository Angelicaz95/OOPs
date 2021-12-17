package com.company.class27;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Life");
        arrayList.add("Orange");
        arrayList.add("Car");
        arrayList.add("Lemp");
        arrayList.add("Purple");
        arrayList.add("Leve");
        //remove the e from the words at the end
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (str.toLowerCase().endsWith("e")) {
                //  arrayList.set(i,str.substring(0,str.length()-1));
                int sizeOfWord = str.length();
                int lastIndex = sizeOfWord - 1;
                String newStr = str.substring(0, lastIndex);
                arrayList.set(i, newStr);

            }
        }

        //removes the e from the words anywhere
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (str.toLowerCase().contains("e")) {

                arrayList.set(i, (str.replace("e", "")));
            }
        }
        System.out.println(arrayList);
    }
}
