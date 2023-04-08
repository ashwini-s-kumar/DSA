package com.topicwise.hashing.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String [] arr){
        Set<String>  set = new HashSet<>();
        set.add("abc");
        set.add("bcd");
        set.add("cde");

        System.out.println(set);
        System.out.println(set.contains("bcd"));

        set.remove("bcd");
        set.add("efg");

        Iterator<String> interator = set.iterator();
        while (interator.hasNext()){
            System.out.print(interator.next() + " ");
            interator.remove();
        }
    }
}
