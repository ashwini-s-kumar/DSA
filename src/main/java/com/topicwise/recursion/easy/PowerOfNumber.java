package com.topicwise.recursion.easy;

public class PowerOfNumber {
    public static int power(int num, int n){
        if(n == 0){
            return 1;
        }
        return num * power(num, n-1);
    }
    public static void main(String [] arr){
        System.out.println(power(5, 3));
    }
}
