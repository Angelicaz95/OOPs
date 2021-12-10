package com.company.class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
    public static void main(String[] args) {


    HashSet<String> hasSet=new HashSet<>();
    hasSet.add("Apple");
    hasSet.add("Mango");
    hasSet.add("Kiwi");
    hasSet.add("Apple"); // duplicate won't print
    System.out.println(hasSet); // order won't be maintained
        // super fast

        ArrayList<String> arrayList=new ArrayList<>(hasSet); // convert it to
        System.out.println(arrayList);

        LinkedHashSet<String> hasSet2=new LinkedHashSet<>(arrayList); // converting back 


}

}
