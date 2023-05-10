package com.topicwise.recursion.easy;

public class SumOfDigits {
    public static int sumOfDigits(int n)
    {
        if(n == 0){
            return 0;
        }

        return n%10 + sumOfDigits(n/10);
    }
    public static void main(String [] arr){
        System.out.println(sumOfDigits(123));
    }
}
