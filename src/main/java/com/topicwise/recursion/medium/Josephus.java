package com.topicwise.recursion.medium;

public class Josephus {
    public static int josephus(int n, int k) {


        if (n == 1) { //base case
            return 1;
        } else {
  /* The position returned by josephus(n - 1, k) is adjusted because the
       recursive call josephus(n - 1, k) considers the original position
       k%n + 1 as position 1 */
            return (josephus(n - 1, k) + k - 1) % n + 1; //recursion
        }
    }

    public static int josephusSimple(int n, int k) {


        if (n == 1) { //base case
            return 0;
        } else {
  /* The position returned by josephus(n - 1, k) is adjusted because the
       recursive call josephus(n - 1, k) considers the original position
       k%n + 1 as position 1 */
            return (josephusSimple(n - 1, k) + k) % n ; //recursion
        }
    }


    public static void main(String [] arr){
        int n = 3, k = 2;

        System.out.println("The safest position : ");
        System.out.println(josephusSimple(n, k) +1);
        System.out.println(josephus(n, k));
    }
}

/*
Given the total number of persons n and a number k which indicates that k-1 persons are
 skipped and kth person is killed in circle in a fixed direction.

After each operation, the count will start from k+1th person. The task is to choose the safe place
in the circle so that when you perform these operations starting from 1st place in the circle,
you are the last one remaining and survive.
 */
