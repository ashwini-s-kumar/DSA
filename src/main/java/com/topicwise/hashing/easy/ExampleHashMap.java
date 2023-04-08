package com.topicwise.hashing.easy;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String [] arr){
        Map<String, Integer> map = new HashMap<>();

        map.put("abc",30);
        map.put("bcd", 40);
        map.put("def", 50);

        System.out.println(map.containsValue(30));
        System.out.println(map.containsKey("bcd"));

        map.remove("abc");
        map.put("xyz",90);

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() +  " : " + entry.getValue() + ", ");
        }
    }
}
