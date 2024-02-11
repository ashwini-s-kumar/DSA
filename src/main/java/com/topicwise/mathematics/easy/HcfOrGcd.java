package com.topicwise.mathematics.easy;

public class HcfOrGcd {
  /*
  Time Complexity: O(log(min(a,b))

  Auxiliary Space: O(1)
   */
  static int hcf(int n, int m){
    int diff ;
    if(n > m){
      if( n % m == 0){
        return m;
      }
      diff = n - m;
      return hcf(diff, m);
    }
    else {
      if(m % n == 0)
      {
        return n;
      }
      diff = m - n;
      return hcf(diff, n);
    }
  }
  public static void main(String [] arr){
    System.out.println("42 and 56 : "+ hcf(42, 56));
  }
}
