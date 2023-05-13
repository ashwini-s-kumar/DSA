package com.topicwise.string.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NthNumMadeOfPrimeDigits {
    public static int primeDigits(int n)
    {
        //Your code here

        List<Integer> set = new ArrayList<Integer>();
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);


        Queue<Integer> q = new LinkedList<Integer>();
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(7);

        int count = 0;
        while(count != n){
            int num = q.poll();
            count ++;
            if(count == n){
                return num;
            }
            for(int setNum :set){
                q.add((num) * 10 + setNum);
            }
        }
        return 0;
    }

    public static void main(String [] arr){
        System.out.println(primeDigits(10));
    }
}
/*
Given a number 'N'. The task is to find the Nth number whose each digit is a prime number i.e 2, 3, 5, 7.
In other words you have to find nth number of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.
 */