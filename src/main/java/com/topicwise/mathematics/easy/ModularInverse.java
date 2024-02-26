package com.topicwise.mathematics.easy;

public class ModularInverse {
  /*
  A number x is said to modular multiplicative inverse of a under m if (a%m * x%m)%m = 1.
   */

  static int modInverse(int a, int m)
  {
    // taking mod of a with m
    a = a%m;

    // For every number x, check if (a*x)%m is 1
    for (int x=1; x<m; x++)
      if ((a*x) % m == 1)
        return x;
    return -1;
  }
  public static void main(String [] arr){
    System.out.println(modInverse(3, 11));
  }
}
