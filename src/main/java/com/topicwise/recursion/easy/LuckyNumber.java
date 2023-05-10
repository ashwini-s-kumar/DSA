package com.topicwise.recursion.easy;

public class LuckyNumber {
    public static boolean check(int n,int counter)
    {
        if(counter<=n){
            if(n%counter==0)
                return false;
            // calculate next position of input number
            n=n-n/counter;
            counter++;
            // make recursive call with updated counter
            // and position return check(n, counter);
            return check(n, counter);
        }
        else
            return true;
    }


    public static boolean isLucky(int n)
    {
        return check(n,2);
    }
    public static void main(String [] arr){
        System.out.println(isLucky(5));
    }
}

/*
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
First, delete every second number, we get following reduced set.
1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
Now, delete every third number, we get
1, 3, 7, 9, 13, 15, 19,….….
Continue this process indefinitely……
Any number that does NOT get deleted due to above process is called “lucky”.
 */
