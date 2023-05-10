package com.topicwise.recursion.easy;

public class DigitalRoot {
    /*
    DigitalRoot of a number is the recursive sum of
    its digits until we get a single digit number.
     */
    public static int digitalRoot(int n)
    {
        // add your code here
        if(n >= 10){

            n = digitalRoot(n % 10 + digitalRoot(n/10));
        }
        return n;
    }
    public static void main(String [] arr){
        System.out.println(digitalRoot(99999));
    }
}
