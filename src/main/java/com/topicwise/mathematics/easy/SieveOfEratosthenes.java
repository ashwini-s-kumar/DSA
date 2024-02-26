package com.topicwise.mathematics.easy;

import java.util.Arrays;
/*
Problem Description: Given a number n,
print all primes smaller than or equal to n.

Time Complexity: O(n*log(log(n)))

Auxiliary Space: O(n)
 */
public class SieveOfEratosthenes {
  static void sieve(int n)
  {
    if(n <= 1)
      return;

    boolean isPrime[] = new boolean[n+1];

    Arrays.fill(isPrime, true);

    for(int i=2; i*i <= n; i++) // n
    {
      if(isPrime[i])
      {
        for(int j = i*i; j <= n; j = j+i) //
        {
          isPrime[j] = false;
        }
      }
    }

    for(int i = 2; i<=n; i++)
    {
      if(isPrime[i])
        System.out.print(i+" ");
    }
  }

  public static void main (String[] args) {

    int n = 18;

    sieve(n);

  }
}

