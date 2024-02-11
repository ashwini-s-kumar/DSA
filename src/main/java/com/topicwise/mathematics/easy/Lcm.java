package com.topicwise.mathematics.easy;

public class Lcm {
  /*
  a x b = LCM(a, b) * GCD (a, b)
  LCM(a, b) = (a x b) / GCD(a, b)

  Time Complexity: O(log(min(a,b))
   */

  static int lcm(int n, int m){
    return (n * m )/ HcfOrGcd.hcf(n, m);
  }

  public static void main(String [] arr){
    System.out.println("15 and 20 : "+ lcm(15, 20));
  }
}
