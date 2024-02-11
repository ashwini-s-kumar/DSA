package com.topicwise.mathematics.easy;

public class CheckPrime {
  /*
  Time Complexity: O(sqrt(n))

  Auxiliary space: O(1)
   */
  static boolean isPrime(int n){
    double sqrt = Math.sqrt(n);
    for(int i = 2; i <= sqrt; i++){
      if( n % i == 0){
        return false;
      }
    }
    return true;
  }
  public static void main(String [] arr){
    System.out.println("11 "+ isPrime(11));
    System.out.println("10 "+ isPrime(10));
  }
}
