package com.topicwise.recursion.easy;

public class CountDigits {
    public static int countDigits(int n)
    {
        if(n == 0){
            return 0;
        }
        return 1 + countDigits(n/10);
    }

    public static void main(String [] arr){
        System.out.println(countDigits(123));
    }
}
