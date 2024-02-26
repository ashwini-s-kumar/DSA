package com.topicwise.mathematics.easy;

public class ComputingPower {

  /*
    Iterative :
    Every number can be written as the sum of powers of 2
    We can traverse through all the bits of a number from LSB to MSB in O(log n) time.
    Time Complexity: O(log n)
    Auxiliary Space: O(1)
   */

  static int powerIterative(int x, int n){
    int res = 1;
    while(n > 0){
      if(n % 2 != 0){
        // bit is 1
        res = res * x;
      }
      x = x * x;
      n = n / 2;
    }
    return res;
  }

  /*
    recursively :
    power(x, n) = power(x, n / 2) * power(x, n / 2);        // if n is even
    power(x, n) = x * power(x, n / 2) * power(x, n / 2);    // if n is odd
    Time Complexity: Theta(logn)
    Auxiliary Space: Theta(logn) // Since uses recursion and height of tree goes upto logn height
   */

  static int powerRecursion(int x, int n){
    if(n == 0){
      return 1;
    }
    int temp = powerRecursion(x, n/2);
    temp = temp * temp;
    if(n % 2 == 0){
      return temp;
    }
    else{
      return temp * x;
    }
  }

  public static void main(String [] a){
    System.out.println(powerIterative(3,3));
    System.out.println(powerRecursion(3,3));
  }
}
