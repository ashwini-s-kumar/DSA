package com.topicwise.recursion.easy;

public class Fibonacci {
    // 0 1 1 2 3 5 8
    // nth = (n-1)th + (n-2)th
    private static int fibonacci(int n){
        if(n == 1 || n ==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String [] arr){
        System.out.println(fibonacci(5));
    }
}
