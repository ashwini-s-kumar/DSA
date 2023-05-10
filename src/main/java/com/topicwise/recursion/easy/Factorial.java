package com.topicwise.recursion.easy;

public class Factorial {
    // 5 !  = 1 * 2 * 3 * 4 * 5
    private static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String [] arr){
        System.out.println(factorial(3));
    }
}
