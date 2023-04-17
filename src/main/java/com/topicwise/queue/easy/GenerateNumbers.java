package com.topicwise.queue.easy;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class GenerateNumbers {
    public static void generate(Set<Integer> numbers, int n){
        Queue<String> queue = new ArrayDeque<>();
        for(int a : numbers){
            queue.add(String.valueOf(a));
        }
        int i = 1;
        while (!queue.isEmpty() && i <= n){
            String temp = queue.poll();
            System.out.print(temp + " ");
            i++;
            for(int a : numbers){
                queue.add((temp + a));
            }
        }
    }

    public static void main(String [] arr){
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        generate(set, 100);
    }
}
