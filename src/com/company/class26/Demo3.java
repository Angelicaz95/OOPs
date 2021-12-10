package com.company.class26;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> subjects1 = new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("GIT");
        subjects1.add("Selenium");
        subjects1.add("TestNg");

       // System.out.println(subjects1.get(3));


       // for (int i = 0; i < subjects1.size(); i++) { // remove all the elements that have more than 4 characters

        //   if(subjects1.get(i).length()>4){   // will not check the condition for the last element, TestNg will be printed as well

        //        subjects1.remove(i);
         //   }
         //   System.out.println(subjects1.get(i)); // will print all elements one by one

      //  }
     // System.out.println(subjects1);
// WE DON'T USE LOOPS WITH COLLECTION FRAMEWORKS , ITERATORS ARE PREFERRED
    }
}
